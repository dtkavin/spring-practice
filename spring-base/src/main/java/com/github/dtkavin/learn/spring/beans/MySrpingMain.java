package com.github.dtkavin.learn.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 11/13/16.
 */
public class MySrpingMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dev/spring-context.xml");

        //通过class 获得
//        Person bean = context.getBean(PoliceMan.class);

        //通过 id 获得
//        Person bean = (Person) context.getBean("police");
//        bean.drive();

        Drive driver = context.getBean(Drive.class);
        driver.drive();


    }
}
