package com.cydeo.runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before scenario is running");
    }
    @After
    public void tearDown(){
        System.out.println("After scenario is running");
    }
}
