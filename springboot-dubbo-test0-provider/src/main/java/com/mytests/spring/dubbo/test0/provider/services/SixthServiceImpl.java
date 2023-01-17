package com.mytests.spring.dubbo.test0.provider.services;

import com.mytests.spring.dubbo.test0.api.SixthService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@DubboService
public class SixthServiceImpl implements SixthService {
    @Override
    public String returnSixth() {
        return "sixth: test";
    }
}
