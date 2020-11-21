package com.yuan.dubbo.consumer;

import com.yuan.dubbo.api.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/21 3:47 下午
 */
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        ProviderService bean = context.getBean(ProviderService.class);
        String yuan = bean.sayHello("yuan");
        System.out.println(yuan);
    }
}
