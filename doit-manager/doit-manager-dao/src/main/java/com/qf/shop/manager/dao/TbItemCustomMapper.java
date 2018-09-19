package com.qf.shop.manager.dao;

import com.qf.shop.manager.pojo.vo.ItemIndex;
import com.qf.shop.manager.pojo.vo.TbItemCustom;

import java.util.List;
import java.util.Map;

/**
 * User: DHC
 * Date: 2018/8/29
 * Time: 15:14
 * Version:V1.0
 */
public interface TbItemCustomMapper {

    long countItems(Map<String,Object> map);

    List<TbItemCustom> listItemsByPage(Map<String,Object> map);

    /**
     *
     * @param itemIndex 新增商品对象
     * @return 返回保存数量结果
     */
    int saveItem(ItemIndex itemIndex);
}
