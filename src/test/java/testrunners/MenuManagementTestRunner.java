package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/java/linkedinlearning/cucumbercourse/features"},
                  glue = {"stepdefinitions"},
                  tags = "@NightlyRunTest and @RegularTest",
                  plugin = {"pretty"})
public class MenuManagementTestRunner {
}
