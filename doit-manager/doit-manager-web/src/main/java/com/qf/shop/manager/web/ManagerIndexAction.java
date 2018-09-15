package com.qf.shop.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: DHC
 * Date: 2018/8/28
 * Time: 9:35
 * Version:V1.0
 */
@Controller
public class ManagerIndexAction {

    //login.jsp  http://localhost:81/manager/login
    //test1.jsp  http://localhost:81/manager/test1
    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String index1(@PathVariable String page){
        return page;
    }

    //welcome.jsp http://localhost:81/manager/pages/welcome
    @RequestMapping(value = "/pages/{pageName}",method = RequestMethod.GET)
    public String index2(@PathVariable String pageName){
        return "pages/" + pageName;
    }

    @RequestMapping(value = "/pages/{pageName1}/{pageName2}",method = RequestMethod.GET)
    public String index3(@PathVariable String pageName1,@PathVariable String pageName2){
        return "pages/" + pageName1 + "/" + pageName2;
    }
}
