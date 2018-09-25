package com.qf.shop.consumer;

import com.qf.shop.provider.service.HelloInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yby.
 * Date 2018/9/21 17:52.
 * Description:
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-consumer.xml"});
        ctx.start();
        //获取远程代理对象
        HelloInterface service = (HelloInterface) ctx.getBean("helloService");
        System.out.println(service.sayHello("niHao"));
        System.out.println("++++++++++++++++++++++++++++++++");
        HelloInterface helloService = (HelloInterface) ctx.getBean("helloService");
        System.out.println(helloService.sayHello("china"));

    }
}
