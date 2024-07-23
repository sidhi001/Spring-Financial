package TestRunner.java;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
features = ".//Features/UCS.feature" ,
                glue = "StepDefinition",
                dryRun = false,
                monochrome = true,
          plugin = {"pretty", "html:target/generated-test-sources/test-output.html"}
        )
public class TestRunner {

}
