package com.qf.shop.manager.web;

import com.qf.shop.common.pojo.dto.ResultMessage;
import com.qf.shop.manager.pojo.vo.ItemIndex;
import com.qf.shop.manager.service.ItemIndexService;
import com.sun.corba.se.spi.ior.iiop.IIOPProfileTemplate;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * Created by Administrator on 2018/9/15.
 */
@Controller
public class IndexImportAction {

    private Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    ItemIndexService service;


    @RequestMapping(value = "/item/indexlib/import",method = RequestMethod.POST)
    @ResponseBody
    public ResultMessage importIndex(){

        System.out.println("控制器访问了");
        ResultMessage resultMessage=new ResultMessage();


        try {
            List<ItemIndex> list = service.listAll();
            //resultMessage.setData(list);
            resultMessage.setSuccess(true);
            resultMessage.setMessage("success");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            resultMessage.setSuccess(false);
            resultMessage.setMessage("failed");
        }


        return resultMessage;
    }

}

