package com.github.dtkavin.spring.di;

import org.springframework.stereotype.Component;

/**
 * Created by john on 17-2-12.
 */


@Component
public class CDPlayer {
    private CDDisk disk;

    public CDPlayer() {
    }

    private void check(){
        if (disk ==null)
            throw new IllegalArgumentException("no disk in play");
    }

    public void doPlay(){
        check();
        String play=disk.play();
        System.out.println(play);
        endNotify();
    }

    private void endNotify(){
        System.out.println(disk.getCDName() + " is reaching end");
    }

    public void setCD(String name){
        //factory produce
        if("jack".equals(name))
            disk=new JackCDDisk();
        else if("ladygaga".equals(name))
            disk=new LadyGaGaCDDisk();
        else
            throw new IllegalArgumentException("no such CD");
    }

}
