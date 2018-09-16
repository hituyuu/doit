package com.qf.shop.search.web;

import com.qf.shop.common.core.PropKit;
import com.qf.shop.common.pojo.dto.PageInfo;
import com.qf.shop.search.pojo.dto.IndexResult;
import com.qf.shop.search.pojo.vo.TbItemIndex;
import com.qf.shop.search.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 接收前台页面的查询请求
 * 返回前台需要的数据并跳转到search模块
 * Created by yby on 2018/9/16.
 */
@Controller
public class SearchSolrAction {

    @Autowired
    SolrService solrService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        System.out.println("index控制器被访问了");
        return "index";
    }
    /**
     *
     * @param keyword 前台的查询关键字
     * @param pageInfo 前台传来的分页信息
     * @param model 返回给前台的数据传输对象
     * @return
     */
    @RequestMapping(value = "/search/search" , method = RequestMethod.GET)
    public String search(String keyword, PageInfo pageInfo, Model model){

        System.out.println("接收的关键字是->"+keyword);

        // 读取每页显示数量文件
        Integer pageSize = PropKit.use("file.properties").getInt("search.pagesize");
        pageInfo.setLimit(pageSize);

        IndexResult result=solrService.listAll(keyword,pageInfo);
        List<TbItemIndex> list = result.getList();
        model.addAttribute("list", list);
        return "index";
    }
}
