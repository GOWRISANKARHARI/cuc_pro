package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
    features = "src/test/resources/com/feature/loginpage.feature",
    glue = "cucumber_pro2",
    monochrome = true
)
public class runn extends AbstractTestNGCucumberTests {
}