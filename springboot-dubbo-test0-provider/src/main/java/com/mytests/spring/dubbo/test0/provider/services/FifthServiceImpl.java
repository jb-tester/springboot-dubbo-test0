package com.mytests.spring.dubbo.test0.provider.services;

import com.mytests.spring.dubbo.test0.api.FifthService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@DubboService
public class FifthServiceImpl implements FifthService {
    @Override
    public String returnFifthM1(String arg) {
        return "fifth: test1 with " + arg + ";";
    }

    @Override
    public String returnFifthM2(String arg1, String arg2) {
        return "fifth: test2 with "+ arg1 + " and " + arg2 + ";";
    }
}
