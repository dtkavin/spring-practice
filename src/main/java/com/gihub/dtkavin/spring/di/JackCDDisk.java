package com.gihub.dtkavin.spring.di;

import org.springframework.stereotype.Component;

/**
 * Created by john on 17-2-12.
 */
@Component
public class JackCDDisk implements CDDisk {
    private String name = "jack disk";

    public String play() {
        return name + "  is play";
    }

    public String getCDName() {
        return name;
    }
}
