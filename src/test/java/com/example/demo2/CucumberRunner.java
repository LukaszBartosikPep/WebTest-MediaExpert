package com.example.demo2;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test",
        glue= "com.example.demo2"
)
public class CucumberRunner {






}