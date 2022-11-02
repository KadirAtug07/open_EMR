package openEmr.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "openEmr/stepDefinitions",
        tags = "@smoke1",
        dryRun = false,
        plugin = {"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)

public class Runner {
}
