package com.mytests.spring.dubbo.test0.provider.services;

import com.mytests.spring.dubbo.test0.api.SecondService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@DubboService(methods = {@Method(name = "returnSecond2", timeout = 250, retries = 0)})
public class SecondServiceProvided implements SecondService {
    @Override
    public String returnSecond1() {
        return "second: test1";
    }
}
