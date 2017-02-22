package com.github.dtkavin.spring.di;

import org.springframework.stereotype.Component;

/**
 * Created by john on 17-2-12.
 */
@Component
public class LadyGaGaCDDisk implements CDDisk {
    private String name = "lady gaga disk";

    public String play() {
        return name + "  is play";
    }

    public String getCDName() {
        return name;
    }
}
