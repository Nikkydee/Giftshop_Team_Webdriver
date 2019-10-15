package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static stepdefs.Gftshp_loginsteps.driver;

public class HomepageStepdef {
    @Given("^I am logged on to Giftshop website$")
    public void iAmLoggedOnToGiftshopWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }
    @And("^I view the Homepage$")
    public void i_view_the_Homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I can view all homepage menus$")
    public void i_can_view_all_homepage_menus() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
