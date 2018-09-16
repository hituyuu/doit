package com.qf.shop.manager.service;

import com.qf.shop.manager.pojo.vo.ItemIndex;

import java.util.List;

/**
 *
 * Created by Administrator on 2018/9/15.
 */
public interface ItemIndexService {

    /**
     * dao和service层获取多个对象时使用list命名方法
     * 用于查询tb_item中所有的数据,以便建立solr全文检索
     * @return ItemIndex的vo对象
     */
    List<ItemIndex> listAll();
}
