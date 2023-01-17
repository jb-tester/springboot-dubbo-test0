package com.mytests.spring.dubbo.test0.provider.services;

import com.mytests.spring.dubbo.test0.api.FirstService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@DubboService
public class FirstServiceProvided implements FirstService {
    @Override
    public String returnFirst() {

        return "first: test1";
    }

    @Override
    public String returnFirstTest2() {
        return "first: test2";
    }
}
