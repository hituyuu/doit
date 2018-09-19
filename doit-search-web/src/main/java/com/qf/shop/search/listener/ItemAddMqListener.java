package com.qf.shop.search.listener;

import com.qf.shop.search.pojo.vo.TbItemIndex;
import com.qf.shop.search.service.ItemSearchService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.io.IOException;

/**
 * Created by yby.
 * Date 2018/9/18 16:51.
 * Description:
 */
public class ItemAddMqListener implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemSearchService itemService;

    @Autowired
    private SolrServer solrServer;

    @Override
    public void onMessage(Message message) {
        System.out.println("订阅者search监听运行了");
        // 将队列中的meaage转为TextMessage
        TextMessage textMessage = (TextMessage) message;
        try {
            // 得到新增商品的id
            long itemId = Long.parseLong(textMessage.getText());
            System.out.println("新增商品id->"+itemId);
            // 查询数据库得到新增商品信息
            TbItemIndex itemIndex = itemService.getByItemId(itemId);

            System.out.println("itemIndex.title->"+itemIndex.getTitle());
            // 将新增商品添加到solr而文档
            SolrInputDocument documentList = new SolrInputDocument();
            System.out.println("documentList->"+documentList);
            documentList.addField("id", itemIndex.getId());
            documentList.addField("item_title", itemIndex.getTitle());
            documentList.addField("item_sell_point", itemIndex.getSellPoint());
            documentList.addField("item_price", itemIndex.getPrice());
            //documentList.addField("item_image", itemIndex.getImage());

            System.out.println("item_title->"+itemIndex.getTitle());

            solrServer.add(documentList);
            solrServer.commit();

            System.out.println("solr库提交了");
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
