package com.qf.shop.item.dao;

import com.qf.shop.item.pojo.vo.TbItemIndex;

/**
 * 该接口用于search模块查询mysql数据库
 * Created by yby.
 * Date 2018/9/18 17:21.
 * Description:
 */
public interface TbItemFtlMapper {

    TbItemIndex getByItemId(long itemId);
}
