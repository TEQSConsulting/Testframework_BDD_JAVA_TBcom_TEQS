package com.testingBoard.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // this is used for determing what will run in this framework
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",
        features="src/test/resources/features",
        glue = "com/testingBoard/steps_definitions",
        dryRun = false,

        tags = "@wip"

)
public class CukesRunner{

}




