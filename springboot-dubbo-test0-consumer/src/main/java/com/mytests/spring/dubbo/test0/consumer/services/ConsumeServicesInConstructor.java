package com.mytests.spring.dubbo.test0.consumer.services;

import com.mytests.spring.dubbo.test0.api.*;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@Component
public class ConsumeServicesInConstructor {

    public ConsumeServicesInConstructor(FifthService fifthService, SixthService sixthService, SeventhService seventhService) {
        this.fifthService = fifthService;
        this.sixthService = sixthService;
        this.seventhService = seventhService;
    }

    @DubboReference(methods = {@Method( name = "returnFifthM1", onreturn = "utils.utilsMethod1Async" )})
    private final FifthService fifthService;

    private final SixthService sixthService;

    @DubboReference
    private final SeventhService seventhService;




    public String displayFifthService(){
        return fifthService.returnFifthM1("aaa")+" "+fifthService.returnFifthM2("bbb","ccc");
    }
    public String displaySixthService(){
        return sixthService.returnSixth();
    }

    public String displaySeventhService(){
        return seventhService.returnSeventh();
    }
}
