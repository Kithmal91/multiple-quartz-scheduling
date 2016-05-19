package com.cookiecodelabs.kithmal.demo.helper;

import org.springframework.stereotype.Component;

/**
 * Created by Kithmal on 5/6/2016.
 */
@Component(value = "schedulerHelper")
public class SchedulerHelper {

    // print message one - in scheduler one
    public void displayMessageOne() {
        System.out.println("Hello from DemoSchedulerOne");
    }

    //print message two - in scheduler two
    public void displayMessageTwo() {
        System.out.println("Hello from DemoSchedulerTwo");
    }
}
