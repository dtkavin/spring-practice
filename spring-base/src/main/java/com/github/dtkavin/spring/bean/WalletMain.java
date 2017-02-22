package com.github.dtkavin.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by john on 2/19/17.
 */
public class WalletMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Wallet.class);
        Object money = context.getBean("money");
        System.out.println(money.toString());
    }
}
