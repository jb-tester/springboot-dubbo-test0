package com.mytests.spring.dubbo.test0.provider.services;

import com.mytests.spring.dubbo.test0.api.FirstService;
import com.mytests.spring.dubbo.test0.api.SecondService;
import com.mytests.spring.dubbo.test0.api.ThirdService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@DubboService()
public class ThirdServiceProvided implements ThirdService {

    @DubboReference
    private FirstService firstService;
    @DubboReference
    private SecondService secondService1;
    @DubboReference
    private SecondService secondService2;

    @Override
    public String useServices() {
        return "third: "+firstService.returnFirst()+" "+ secondService1.returnSecond1();
    }
}
