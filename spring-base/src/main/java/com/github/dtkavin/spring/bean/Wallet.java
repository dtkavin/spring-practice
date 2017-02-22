package com.github.dtkavin.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by john on 2/19/17.
 */
@Configuration
public class Wallet {
    private int money = 200;

    public int getMoney() {
        return money;
    }

    @Bean
    public String money() {
        return new String("money");
    }
}
