package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-reports1/Cucumber1.json"},
    features = "src/test/resources/com/feature/loginpage.feature",
    glue = "cucumber_pro2",
    monochrome = true
)
public class runn extends AbstractTestNGCucumberTests {
}