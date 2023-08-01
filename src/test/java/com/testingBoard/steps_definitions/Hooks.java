package com.testingBoard.steps_definitions;

import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Before Scenario is running");
    }

    @After
    public void tearDown(){

    }
}
