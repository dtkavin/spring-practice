package com.gihub.dtkavin.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by john on 17-2-12.
 */
@Component
public class PlayerMain {

    public static void main(String[] args) {
//        PlayerMain.selfLoadMain();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PlayerMain playerMain =(PlayerMain) context.getBean("playerMain");
        playerMain.bySpringConfigClass();
    }


    @Autowired
    CDPlayer player;

    private void bySpringConfigClass() {

        player.setCD("jack");
        player.doPlay();
    }

    private static void selfLoadMain() {
        CDPlayer player = new CDPlayer();
        player.setCD("jack");
        player.doPlay();
    }
}
