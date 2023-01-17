package com.mytests.spring.dubbo.test0.consumer.services;

import com.mytests.spring.dubbo.test0.api.UtilsService;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
@Service("utils")
public class UtilsServiceImpl implements UtilsService {

    @Override
    public String utilsMethod1(String request) {
        System.out.println("!!!!!!!!!!!!!!!!! \n request returned: "+request+"\n !!!!!!!!!!!!!!");
        return request;
    }

    @Override
    public String utilsMethod2(String response, String request) {
        System.out.println("!!!!!!!!!!!!!!!!! Request "+request+" invoked !!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!! Responce "+response+" returned !!!!!!!!!!!!!!");
        return response+" "+request;
    }
}
