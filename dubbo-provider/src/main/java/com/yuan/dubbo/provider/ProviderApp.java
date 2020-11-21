package com.yuan.dubbo.provider;

import org.apache.dubbo.container.Main;

import java.io.IOException;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/19 5:39 下午
 */
public class ProviderApp {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
//        context.start();
//        System.in.read(); // 按任意键退出
        //等同上面3行代码作用
        Main.main(args);
    }
}
