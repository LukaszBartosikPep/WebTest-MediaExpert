package com.example.demo;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test",
        glue= "com.example.demo"
)
public class CucumberRunner {





}