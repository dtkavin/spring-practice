package com.github.dtkavin.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by john on 2/21/17.
 */

@Aspect
public class Recorder {
    @Before("execution (com.github.dtkavin.spring.aop.Worker.*(..))")
    public void writeTime(){
        System.out.println(new Date());
    }
    @After("execution(** com.github.dtkavin.spring.aop.Worker.*(..))")
    public void writeDone(){
        System.out.println("done");
    }
}
