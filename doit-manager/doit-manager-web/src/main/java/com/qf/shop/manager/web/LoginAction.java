package com.qf.shop.manager.web;

import com.qf.shop.common.pojo.dto.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yby.
 * Date 2018/9/17 20:06.
 * Description:
 */
@Controller
public class LoginAction {

    @RequestMapping(value = "/{path}",method = RequestMethod.GET)
    public String login(@PathVariable String path, PageInfo pageInfo){
        System.out.println("login控制器:page&limit-->"+pageInfo.getPage()+"&"+pageInfo.getLimit());

        return path;
    }

    @RequestMapping(value = "/pages/{path}",method = RequestMethod.GET)
    public String moudle(@PathVariable String path, PageInfo pageInfo){
        System.out.println("module控制器");

        return "pages/"+path;
    }

    @RequestMapping(value = "/pages/{pageName1}/{pageName2}",method = RequestMethod.GET)
    public String index3(@PathVariable String pageName1,@PathVariable String pageName2){
        System.out.println("index3控制器被访问了");
        return "pages/" + pageName1 + "/" + pageName2;
    }
}
