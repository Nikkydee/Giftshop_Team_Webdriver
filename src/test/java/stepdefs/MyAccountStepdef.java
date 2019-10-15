package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static stepdefs.Gftshp_loginsteps.driver;

public class MyAccountStepdef {
    @Given("^I m on giftshop website$")
    public void iMOnGiftshopWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }
    @When("^I click the My Acct options drop down menu option$")
    public void i_click_the_My_Acct_options_drop_down_menu_option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^I can view my Account options$")
    public void i_can_view_my_Account_options() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
