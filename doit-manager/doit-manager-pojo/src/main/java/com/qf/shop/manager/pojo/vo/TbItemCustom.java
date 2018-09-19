package com.qf.shop.manager.pojo.vo;

import com.qf.shop.manager.pojo.po.TbItem;

/**
 * User: DHC
 * Date: 2018/8/30
 * Time: 9:42
 * Version:V1.0
 */
public class TbItemCustom extends TbItem {
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
