package com.example.demo2;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test"},
        glue= {"com.example.demo.stepdef"},
        tags={"@TestingLocalShop"}
)
public class CucumberRunner {
}