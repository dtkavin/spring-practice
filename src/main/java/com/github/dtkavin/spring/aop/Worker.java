package com.github.dtkavin.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by john on 2/21/17.
 */
@Component
public class Worker {
    public void firstStep(){
        System.out.println("this is first step");
    }

    public void secondStep(){
        System.out.println("this is second step");
    }

    public void thirdStep(){
        System.out.println("this is third step");
    }
}
