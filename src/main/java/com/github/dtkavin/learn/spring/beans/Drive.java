package com.github.dtkavin.learn.spring.beans;

/**
 * Created by john on 11/4/16.
 */
public class Drive {
    private Person person;

    public Drive(Person person) {
        this.person = person;
    }

    public void drive(Person person) {
        person.drive();
    }

    /**
     * 人开汽车
     */
    public void drive() {
        if (this.person != null) {
            person.drive();
        }
    }
}
