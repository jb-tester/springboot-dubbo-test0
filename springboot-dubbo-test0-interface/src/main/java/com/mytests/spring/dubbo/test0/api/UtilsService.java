package com.mytests.spring.dubbo.test0.api;

import java.util.concurrent.CompletableFuture;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
public interface UtilsService {

    String utilsMethod1(String request);
    String utilsMethod2(String request, String response);

    default CompletableFuture<String> utilsMethod1Async(String message){
        return CompletableFuture.completedFuture(utilsMethod1(message));
    }

    default CompletableFuture<String> utilsMethod2Async(String message1, String message2){
        return CompletableFuture.completedFuture(utilsMethod2(message1, message2));
    }
}
