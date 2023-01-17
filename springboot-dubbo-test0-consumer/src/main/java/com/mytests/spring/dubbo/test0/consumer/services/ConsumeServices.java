package com.mytests.spring.dubbo.test0.consumer.services;

import com.mytests.spring.dubbo.test0.api.FirstService;
import com.mytests.spring.dubbo.test0.api.ForthService;
import com.mytests.spring.dubbo.test0.api.SecondService;
import com.mytests.spring.dubbo.test0.api.ThirdService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@Component
public class ConsumeServices {


    @DubboReference(methods = @Method(name = "returnFirst", onreturn = "utils.utilsMethod1Async"))
    private FirstService firstService;

    @DubboReference
    private SecondService secondService;

    @DubboReference
    private ThirdService thirdService;

    @Autowired
    private ForthService forthService;


    public String displayFirstService(){
        return firstService.returnFirst()+" "+firstService.returnFirstTest2();
    }
    public String displaySecondService1(){
        return secondService.returnSecond1();
    }
    public String displaySecondService2(){
        return secondService.returnSecond2();
    }
    public String displayThirdService(){
        return thirdService.useServices();
    }
    public String displayForthService(){
        return forthService.returnForth();
    }
}
