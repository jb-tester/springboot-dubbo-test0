package com.mytests.spring.dubbo.test0.api;

import java.util.concurrent.CompletableFuture;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
public interface FifthService {
    String returnFifthM1(String arg);
    String returnFifthM2(String a1, String a2);

    default CompletableFuture<String> returnFifthM1Async(String arg){
        return CompletableFuture.completedFuture(returnFifthM1(arg));
    }

    default CompletableFuture<String> returnFifthM2Async(String message1, String message2){
        return CompletableFuture.completedFuture(returnFifthM2(message1, message2));
    }
}
