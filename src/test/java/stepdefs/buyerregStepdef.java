package stepdefs;

import PageObject.loginPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static stepdefs.Gftshp_loginsteps.driver;

public class buyerregStepdef {
    @Given("^I navigate to the Giftshop website$")
    public void iNavigateToTheGiftshopWebsite() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }
    @When("^I click the My Account options drop down$")
    public void i_click_the_My_Account_options_drop_down() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I click on Register menu option$")
    public void i_click_on_Register_menu_option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I input password$")
    public void i_input_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I confirm password$")
    public void i_confirm_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I input telephone$")
    public void i_input_telephone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I select Yes to Newsletter subscription$")
    public void i_select_Yes_to_Newsletter_subscription() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I check the Privacy Policy$")
    public void i_check_the_Privacy_Policy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I click Continue button$")
    public void i_click_Continue_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter firstname \"([^\"]*)\"$")
    public void i_enter_firstname(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter lastname \"([^\"]*)\"$")
    public void i_enter_lastname(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void i_enter_email(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I select No to Become Seller$")
    public void i_select_No_to_Become_Seller() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I am registered$")
    public void i_am_registered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I input an invalid firstname \"([^\"]*)\"$")
    public void i_input_an_invalid_firstname(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I input an invalid lastname \"([^\"]*)\"$")
    public void i_input_an_invalid_lastname(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I input an already registered email$")
    public void i_input_an_already_registered_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I get a validation message'Already registered email$")
    public void i_get_a_validation_message_Already_registered_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
