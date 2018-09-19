package com.qf.shop.search.service;

import com.qf.shop.search.pojo.vo.TbItemIndex;

/**
 * 该接口用于search模块的查询mysql数据库
 * Created by yby.
 * Date 2018/9/18 17:22.
 * Description:
 */
public interface ItemSearchService {

    /**
     * 该方法用于查寻id对应的商品对象
     * @param itemId 商品id
     * @return 商品对象
     */
    TbItemIndex getByItemId(long itemId);
}
