package com.qf.shop.manager.web;

import com.qf.shop.common.pojo.dto.ItemResult;
import com.qf.shop.common.pojo.dto.PageInfo;
import com.qf.shop.common.pojo.dto.ResultMessage;
import com.qf.shop.manager.pojo.vo.ItemIndex;
import com.qf.shop.manager.pojo.vo.TbItemCustom;
import com.qf.shop.manager.pojo.vo.TbItemQuery;
import com.qf.shop.manager.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jms.*;
import java.util.List;

/**
 * User: yby
 * Date: 2018/8/29
 * Time: 14:09
 * Version:V1.0
 */
@Controller
public class ManagerItemAction {
    /**
     * 初始化logger
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 依赖注入service
     */
    @Autowired
    private ItemService itemService;

    @Autowired
    JmsTemplate jmsTemplate;

    /**
     * Destination是一个父类接口,有Queue和Topic两个子接口
     * 此处是多态,实例就是publisher.xml中topicDestination
     */
    @Resource
    Destination topicDestination;

    /**
     * 该方法用于回应前端页面的分页查询请求
     * @param page 前端页面传来的分页信息
     * @param query 封装的查询对象
     * @return 返回的信息封装在ItemResult<TbItemCustom>中
     */
    @ResponseBody
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ItemResult<TbItemCustom> listItemsByPage(PageInfo page, TbItemQuery query) {
        ItemResult<TbItemCustom> result = null;
        try {
            result = itemService.listItemsByPage(page,query);
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 该方法用回应前端页面的批量操作
     * @param ids
     * @return
     * 数组，List
     */
    @ResponseBody
    @RequestMapping(value = "/item/batch",method = RequestMethod.POST)
    public Object updateItemsByIds(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
            i = itemService.updateItemsByIds(ids);
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }


    /**
     *
     * @param itemIndex 前端页面传来的新增商品对象
     * @return 返回信息封装在ResultMessage类中
     */
    @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public ResultMessage saveItem(ItemIndex itemIndex){
        System.out.println("添加商品控制器访问了,新商品id->"+itemIndex.getId());
        ResultMessage resultMessage = new ResultMessage();


        try {
            int saveResult= itemService.saveItem(itemIndex);
            if (saveResult > 0) {
                // 如果存储成功,则发布mq消息
                jmsTemplate.send(topicDestination, new MessageCreator() {
                    @Override
                    public Message createMessage(Session session) throws JMSException {
                        System.out.println("生产消息方法被访问了");
                        // 改匿名内部类返回真正的消息,需包含商品id信息
                        // 但是消息队列的消息不能是普通的String,而是TextMessage类
                        TextMessage textMessage = session.createTextMessage(itemIndex.getId()+"");
                        return textMessage;
                    }
                });

                resultMessage.setMessage("success");
                resultMessage.setSuccess(true);

            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
            resultMessage.setMessage("failed");
            resultMessage.setSuccess(false);
        }

        return resultMessage;

    }
}
