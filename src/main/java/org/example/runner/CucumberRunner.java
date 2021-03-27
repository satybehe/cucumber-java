package org.example.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Projects\\src\\test\\java\\org\\example\\myListener\\features\\WebLogin.feature",
        plugin = {"pretty","html:target/cucumber-report/single",
                "json:target/cucumber-report/single/cucumber.json",
                "rerun:rerun/failed_scenarios.txt"

        },
        glue = {"org.example.stepDefs"}
)
public class CucumberRunner {
}
