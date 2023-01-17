package com.mytests.spring.dubbo.test0.api;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: springboot-dubbo-test0</p>
 * *
 */
public interface SecondService {

    String returnSecond1();
    default String returnSecond2(){
       return "second:test2";
    }
}
