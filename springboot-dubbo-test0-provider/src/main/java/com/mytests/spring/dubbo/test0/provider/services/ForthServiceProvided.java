package com.mytests.spring.dubbo.test0.provider.services;

import com.mytests.spring.dubbo.test0.api.ForthService;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
public class ForthServiceProvided implements ForthService {
    @Override
    public String returnForth() {
        return "forth: test";
    }
}
