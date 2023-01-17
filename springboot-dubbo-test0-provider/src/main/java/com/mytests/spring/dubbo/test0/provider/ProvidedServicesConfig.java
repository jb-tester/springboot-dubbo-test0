package com.mytests.spring.dubbo.test0.provider;

import com.mytests.spring.dubbo.test0.provider.services.ForthServiceProvided;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@Configuration
public class ProvidedServicesConfig {

    @Bean @DubboService
    public ForthServiceProvided forthService() {
        return new ForthServiceProvided();
    }
}
