package com.mytests.spring.dubbo.test0.consumer;

import com.mytests.spring.dubbo.test0.api.ForthService;
import com.mytests.spring.dubbo.test0.api.SixthService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@Configuration
public class ServiceReferencesConfig {

    @Bean @DubboReference(interfaceClass = ForthService.class)
    public ReferenceBean<ForthService> forthService() {
        return new ReferenceBean<>();
    }
    @Bean @DubboReference(interfaceClass = SixthService.class)
    public ReferenceBean<SixthService> sixthService() {
        return new ReferenceBean<>();
    }
}
