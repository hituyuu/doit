package com.qf.shop.common.pojo.dto;

import java.io.Serializable;

/**
 * Created by yby on 2018/9/16.
 */
public class PageInfo implements Serializable{
    /**
     *page为前台传来页码信息
     *limit为前台传来一页展示数量
     * offset为起始行数
     */
    private Integer page;
    private Integer limit;

    public Integer getOffset(){
        return (page-1)*limit;
    }
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
