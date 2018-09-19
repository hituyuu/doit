package com.qf.shop.manager.service;

import com.qf.shop.common.pojo.dto.ItemResult;
import com.qf.shop.common.pojo.dto.PageInfo;
import com.qf.shop.manager.pojo.vo.ItemIndex;
import com.qf.shop.manager.pojo.vo.TbItemCustom;
import com.qf.shop.manager.pojo.vo.TbItemQuery;

import java.util.List;

/**
 * 处理商品的服务层相关接口
 * User: DHC
 * Date: 2018/8/29
 * Time: 14:42
 * Version:V1.0
 */
public interface ItemService {
    /**
     * 分页查询商品
     * @param page 分页条件
     * @return 返回的JSON格式
     */
    ItemResult<TbItemCustom> listItemsByPage(PageInfo page, TbItemQuery query);

    /**
     * 批量修改状态
     * @param ids
     * @return
     */
    int updateItemsByIds(List<Long> ids);

    /**
     * 用于新增商品
     * @param itemIndex 新增商品对象
     * @return 返回插入的数据条数结果
     */
    int saveItem(ItemIndex itemIndex);
}
