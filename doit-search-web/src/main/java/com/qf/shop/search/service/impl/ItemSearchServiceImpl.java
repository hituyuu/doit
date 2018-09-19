package com.qf.shop.search.service.impl;

import com.qf.shop.search.dao.TbItemSearchMapper;
import com.qf.shop.search.pojo.vo.TbItemIndex;
import com.qf.shop.search.service.ItemSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yby.
 * Date 2018/9/18 17:23.
 * Description:
 */
@Service
public class ItemSearchServiceImpl implements ItemSearchService {

    @Autowired
    TbItemSearchMapper mapper;
    @Override
    public TbItemIndex getByItemId(long itemId) {
        System.out.println("service层getByItemId执行了");
        TbItemIndex tbItemIndex = mapper.getByItemId(itemId);
        System.out.println("getByItemId的结果->"+tbItemIndex);
        return tbItemIndex;
    }
}
