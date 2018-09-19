package com.qf.shop.item.service.impl;

import com.qf.shop.item.dao.TbItemFtlMapper;

import com.qf.shop.item.pojo.vo.TbItemIndex;
import com.qf.shop.item.service.ItemFtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yby.
 * Date 2018/9/18 17:23.
 * Description:
 */
@Service
public class ItemFtlServiceImpl implements ItemFtlService {

    @Autowired
    TbItemFtlMapper mapper;
    @Override
    public TbItemIndex getByItemId(long itemId) {
        System.out.println("ItemFtlServiceImpl的service层getByItemId执行了");
        TbItemIndex tbItemIndex = mapper.getByItemId(itemId);
        System.out.println("getByItemId的结果->"+tbItemIndex);
        return tbItemIndex;
    }
}
