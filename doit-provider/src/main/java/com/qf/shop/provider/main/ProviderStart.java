package com.qf.shop.provider.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yby.
 * Date 2018/9/21 16:56.
 * Description:
 */
public class ProviderStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-provider.xml"});

        context.start();

        System.in.read();
    }

}
