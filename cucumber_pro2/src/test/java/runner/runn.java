package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-reports/Cucumber8.json"},
    features = "src/test/resources/com/feature/loginpage.feature",
    glue = "cucumber_pro2"
    

)
public class runn extends AbstractTestNGCucumberTests {

}