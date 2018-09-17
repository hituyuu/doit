package com.qf.shop.search.dao;

import com.qf.shop.common.pojo.dto.PageInfo;
import com.qf.shop.search.pojo.dto.IndexResultDTO;
import com.qf.shop.search.pojo.vo.TbItemIndex;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by yby on 2018/9/16.
 */
@Repository
public class SolrDao {

    @Autowired
    SolrServer solrServer;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public IndexResultDTO listAll(SolrQuery solrQuery, PageInfo pageInfo) {

        System.out.println("dao层执行了");
        IndexResultDTO result = new IndexResultDTO();
        try {
            // 查询solr库
            QueryResponse response = solrServer.query(solrQuery);
            // 得到documents对象
            SolrDocumentList documents = response.getResults();
            // 得到查询总数
            long foundCount = documents.getNumFound();
            Integer limit = pageInfo.getLimit();
            // 算出总页数
            long pages = (foundCount + limit - 1) / limit;

            result.setRecordCount(foundCount);
            result.setTotalPages(pages);

            // 获取高亮集合
            Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();

            // 设置List<TbItemIndex>集合
            List<TbItemIndex> list = new ArrayList<TbItemIndex>();
            // 遍历documents
            for (SolrDocument document:documents) {
                TbItemIndex tbItemIndex = new TbItemIndex();
                String id = (String) document.get("id");
                System.out.println("id->"+id);

                tbItemIndex.setId(id);
                tbItemIndex.setPrice((Long) document.get("item_price"));
                tbItemIndex.setCatName((String) document.get("item_category_name"));
                tbItemIndex.setImage((String) document.get("item_image"));
                tbItemIndex.setSellPoint((String) document.get("item_sell_point"));

                System.out.println("sellpoint->"+(String) document.get("item_sell_point"));

                // title字段是高亮字段,需要从highlighting中获得
                // 通过id得到高亮处理过的标题集合
                List<String> titleList = highlighting.get(id).get("item_title");

                String title = "";
                if (titleList != null && !titleList.isEmpty()) {
                    // 有高亮标题
                    title = titleList.get(0);
                } else {
                    // 无高亮标题
                    title = (String) document.get("item_title");
                }

                tbItemIndex.setTitle(title);
                //将tbItemIndex对象封装到集合
                list.add(tbItemIndex);

            }

            // 将集合封装进IndexResut
            result.setList(list);
        } catch (SolrServerException e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }
}
