package com.qf.shop.search.service.impl;

import com.qf.shop.common.pojo.dto.PageInfo;
import com.qf.shop.search.dao.SolrDao;
import com.qf.shop.search.pojo.dto.IndexResult;
import com.qf.shop.search.service.SolrService;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yby on 2018/9/16.
 */
@Service
public class SolrServiceImpl implements SolrService {
    @Autowired
    SolrDao dao;

    @Override
    public IndexResult listAll(String keyword, PageInfo pageInfo) {
        System.out.println("service层执行了");

        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery(keyword);

        // 页码信息似乎不需要单独设置,
        pageInfo.setPage(1);

        solrQuery.setStart(pageInfo.getOffset());
        solrQuery.setRows(pageInfo.getLimit());
        solrQuery.set("df", "item_keywords");
        //设置是否高亮
        solrQuery.setHighlight(true);
        solrQuery.addHighlightField("item_title");
        solrQuery.setHighlightSimplePre("<em style='color:red'>");
        solrQuery.setHighlightSimplePost("</em>");
        IndexResult result = dao.listAll(solrQuery,pageInfo);
        return result;
    }
}
