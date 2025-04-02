package cucumber_pro2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class loginpage {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("I am in the SauceDemo login page")
    public void i_am_in_the_saucedemo_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user provides username as {string} and password as {string}")
    public void user_provides_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user will see the DashboardText in the page")
    public void user_will_see_the_dashboard_text_in_the_page() {
        WebElement dashboardText = driver.findElement(By.className("title"));
        Assert.assertTrue("Dashboard text is not visible", dashboardText.isDisplayed());
    }

    @Then("user will see an {string}")
    public void user_will_see_an_error_message(String expected) {
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertTrue("Error message is not displayed", errorMessage.isDisplayed());
        Assert.assertEquals("Error message is incorrect", expected, errorMessage.getText());
    }
}