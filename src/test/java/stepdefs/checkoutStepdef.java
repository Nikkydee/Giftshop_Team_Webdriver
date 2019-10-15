package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static stepdefs.Gftshp_loginsteps.driver;

public class checkoutStepdef {
WebDriver driver;
    @Given("^I logged user in giftshop website$")
    public void iLoggedUserInGiftshopWebsite() {
         System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }
    @When("^I select a gift ,add to cart$")
    public void i_select_a_gift_add_to_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I click checkout menu$")
    public void i_click_checkout_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I can pay$")
    public void i_can_pay() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
