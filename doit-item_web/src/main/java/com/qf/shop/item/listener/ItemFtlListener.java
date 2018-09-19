package com.qf.shop.item.listener;

import com.qf.shop.item.pojo.vo.TbItemIndex;
import com.qf.shop.item.service.ItemFtlService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yby.
 * Date 2018/9/19 19:59.
 * Description:
 */
public class ItemFtlListener implements MessageListener {

    @Autowired
    private ItemFtlService itemService;

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Override
    public void onMessage(Message message) {
        System.out.println("item模块的监听器启动了");
        // 获取消息
        TextMessage textMessage = (TextMessage) message;
        try {
            // 获取id
            long itemId = Long.parseLong(textMessage.getText());
            System.out.println("获取的id是->"+itemId);
            TbItemIndex itemIndex = itemService.getByItemId(itemId);

            // 将商品对象封装到map集合中
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("item", itemIndex);

            // 加载ftl模板对象
            Configuration configuration = freeMarkerConfigurer.getConfiguration();
            Template template = configuration.getTemplate("item.ftl");

            // 创建一个输出流，指定输出的目录及文件名。
            Writer out = new FileWriter("D:/ftl/" + itemId + ".html");

            // 正式生成静态页面
            template.process(data,out);

            // 关闭流资源
            out.close();
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
