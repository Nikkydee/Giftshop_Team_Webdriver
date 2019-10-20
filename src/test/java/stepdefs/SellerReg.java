package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SellerReg {
    WebDriver driver;
    @Given("^I am loggd onto  Giftshp website$")
    public void iAmLoggdOntoGiftshpWebsite() {
         System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }
    @When("^I click My Accnt optns menu option$")
    public void i_click_My_Accnt_optns_menu_option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span[1]//*[@id=\"top-links\"]/ul/li[4]/a/span[1]")).click();
        //throw new PendingException();
    }

    @When("^I clck Register menu optn$")
    public void i_clck_Register_menu_optn() throws Throwable {
        driver.findElement((By.linkText("Register"))).click();

        //throw new PendingException();
    }

    @When("^I enter firstname \"([^\"]*)\" and  \"([^\"]*)\" and email \"([^\"]*)\" and password \"([^\"]*)\" and confirmpassword \"([^\"]*)\"$")
    public void i_enter_firstname_and_lastname_and_email_and_password_and_confirmpassword(String firstname, String lastname, String email, String password, String confirmpassword) throws Throwable {
        driver.findElement(By.id("input-firstname")).sendKeys(firstname);
        driver.findElement(By.id("input-lastname")).sendKeys(lastname);
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-password")).sendKeys("evelyn123");
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("evelyn123");
        //throw new PendingException();
    }

    @When("^I enter telephone$")
    public void i_enter_telephone() throws Throwable {
        driver.findElement(By.id("input-telephone")).sendKeys("0809789787678");
        //throw new PendingException();
    }

    @When("^I choose Yes to Newsletter subscription$")
    public void i_choose_Yes_to_Newsletter_subscription() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I choose Yes to Become Seller$")
    public void i_choose_Yes_to_Become_Seller() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I pick Continue button$")
    public void i_pick_Continue_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I can view Seller Registration profile$")
    public void i_can_view_Seller_Registration_profile() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I can view Personal details,SellerInformation,Payment Details icon$")
    public void i_can_view_Personal_details_SellerInformation_Payment_Details_icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I can view 'Registered Seller\\?Login$")
    public void i_can_view_Registered_Seller_Login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter Store Name,Store Phone$")
    public void i_enter_Store_Name_Store_Phone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I select Store logo and Store banner$")
    public void i_select_Store_logo_and_Store_banner() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter store address$")
    public void i_enter_store_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I select Store Country, Store Region,Store City$")
    public void i_select_Store_Country_Store_Region_Store_City() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter Storepostcode  \"([^\"]*)\"$")
    public void i_enter_Storepostcode(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter Storepostcode ,Store Shipping Policy,Store Return Policy$")
    public void i_enter_Storepostcode_Store_Shipping_Policy_Store_Return_Policy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter Store Meta Keywords,Store Meta Description,SEO URL For store,And I enter FacebookLink,Google Plus Link,Twitter Link,instagram link,whatsaapp Number$")
    public void i_enter_Store_Meta_Keywords_Store_Meta_Description_SEO_URL_For_store_And_I_enter_FacebookLink_Google_Plus_Link_Twitter_Link_instagram_link_whatsaapp_Number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^click on Next button$")
    public void click_on_Next_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^enter Seller Bank details$")
    public void enter_Seller_Bank_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter Tax Identification Number$")
    public void i_enter_Tax_Identification_Number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I enter PayPal E-mail ID \"([^\"]*)\"$")
    public void i_enter_PayPal_E_mail_ID(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I click submit button$")
    public void i_click_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I am a registered seller$")
    public void i_am_a_registered_seller() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
