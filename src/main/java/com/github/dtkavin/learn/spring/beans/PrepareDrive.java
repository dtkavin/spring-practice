package com.github.dtkavin.learn.spring.beans;

import java.io.PrintStream;

/**
 * Created by john on 11/13/16.
 * 开车前和开车后的准备工作
 */
public class PrepareDrive {

    private PrintStream stream;

    public PrepareDrive(PrintStream stream) {
        this.stream = stream;
    }

    public void beforeDrive() {
        stream.println("before driving , 到车前加油");
    }

    public void afterDrive() {
        stream.println("after driving , 去泊车");
    }
}
