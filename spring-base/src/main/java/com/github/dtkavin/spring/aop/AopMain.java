package com.github.dtkavin.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2/21/17.
 */
//@Component
public class AopMain {
//    @Autowired
//    Recorder recorder;
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        com.github.dtkavin.spring.aop.Worker worker =(com.github.dtkavin.spring.aop.Worker) context.getBean("worker");
//        AopMain aopMain = (AopMain) context.getBean("aopMain");
//        Worker worker = context.getBean(Worker.class);
        worker.firstStep();
        worker.secondStep();
        worker.thirdStep();

//        aopMain.recorder.writeDone();
    }
}
