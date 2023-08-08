package com.testingBoard.steps_definitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.junit.After;
import org.junit.Before;

import java.sql.SQLOutput;

public class Hooks {
    @Before
    // import from io.cucumber.java not from junit
    public void setup(){
        System.out.println("===Settiing up browser using cucumber @Before");
    }

    @After
    public void tearDown() {
        System.out.println("====closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");


    }
    @BeforeStep
    public void setupsStep(){
        System.out.println("-------------------applying setup using @BeforeSetp");

    }
    @AfterStep
    public void afterStep(){
        System.out.println("--------------------applying tearDown using @AfterStep");
    }
}
