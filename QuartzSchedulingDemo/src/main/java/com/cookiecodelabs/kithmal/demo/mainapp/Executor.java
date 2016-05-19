package com.cookiecodelabs.kithmal.demo.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main Class
 * Created by Kithmal on 5/6/2016.
 */
public class Executor {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("core-context.xml");
    }
}
