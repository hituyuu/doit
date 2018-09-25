package com.qf.shop.provider.service.impl;

import com.qf.shop.provider.service.HelloInterface;

/**
 * Created by yby.
 * Date 2018/9/21 16:44.
 * Description:
 */
public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public String sayHello(String hello) {
        return hello+"word!";
    }
}
