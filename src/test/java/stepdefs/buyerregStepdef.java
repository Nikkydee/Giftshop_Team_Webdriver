package stepdefs;

import PageObject.loginPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static stepdefs.Gftshp_loginsteps.driver;

public class buyerregStepdef {
    WebDriver driver;
    @Given("^I can see Giftshop website$")
    public void iCanSeeGiftshopWebsite() {
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
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span[1]")).click();
       // throw new PendingException();
    }

    @When("^I click on Register menu option$")
    public void i_click_on_Register_menu_option() throws Throwable {
        driver.findElement((By.linkText("Register"))).click();
       // throw new PendingException();
    }

    @When("^I enter firstname \"([^\"]*)\"  #change the parameters to rerun a fresh test$")
    public void i_enter_firstname_change_the_parameters_to_rerun_a_fresh_test(String firstname) throws Throwable {
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        // throw new PendingException();
    }


    @When("^I enter lastname \"([^\"]*)\"$")
    public void i_enter_lastname(String lastname) throws Throwable {
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);
        //throw new PendingException();
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void i_enter_email(String email) throws Throwable {
        driver.findElement(By.id("input-email")).sendKeys(email);
        //throw new PendingException();
    }
    @When("^I input telephone$")
    public void i_input_telephone() throws Throwable {
        driver.findElement(By.id("input-telephone")).sendKeys("0809789787678");
        //throw new PendingException();
    }


    @When("^I input password$")
    public void i_input_password() throws Throwable {
      driver.findElement(By.id("input-password")).sendKeys("evelyn123");
        //throw new PendingException();
    }

    @When("^I confirm password$")
    public void i_confirm_password() throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("evelyn123");
        //throw new PendingException();
    }

    @When("^I select Yes to Newsletter subscription$")
    public void i_select_Yes_to_Newsletter_subscription() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
        //throw new PendingException();
    }
    @When("^I select No to Become Seller$")
    public void i_select_No_to_Become_Seller() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"remove_document\"]")).click();
        //throw new PendingException();
    }

    @When("^I check the Privacy Policy$")
    public void i_check_the_Privacy_Policy() throws Throwable {
        driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
        //throw new PendingException();
    }

    @When("^I click Continue button$")
    public void i_click_Continue_button() throws Throwable {
   driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        //throw new PendingException();
    }

    @Then("^I am registered$")
    public void i_am_registered() throws Throwable {
        Assert.assertEquals(driver.findElement(By.cssSelector("#content > h1")).getText(),"Your Account Has Been Created!");
        //throw new PendingException();
    }

    @Then("^I get a validation message'Already registered email$")
    public void i_get_a_validation_message_Already_registered_email() throws Throwable {
        Assert.assertEquals(driver.findElement(By.cssSelector("#account-register > div.alert.alert-danger.alert-dismissible")).getText(),"Warning: E-Mail Address is already registered!");
        //throw new PendingException();
    }


}
