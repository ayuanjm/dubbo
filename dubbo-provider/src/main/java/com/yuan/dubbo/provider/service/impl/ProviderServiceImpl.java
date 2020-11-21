package com.yuan.dubbo.provider.service.impl;

import com.yuan.dubbo.api.service.ProviderService;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/19 4:00 下午
 */
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String word) {
        System.out.println("hello dubbo");
        return word;
    }
}
