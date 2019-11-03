package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

        //I login as a customer
        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.caret")).click();
        driver.findElement((By.linkText("Login"))).click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("nicholasobagunle@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("nicholas");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    }
    @When("^I select a gift ,add to cart$")
    public void i_select_a_gift_add_to_cart() throws Throwable {
        //this code selects Phones&PDA
        driver.findElement(By.linkText("Phones & PDAs")).click();
        //this code selects iphone
        driver.findElement(By.linkText("iPhone")).click();
        // this code assert if the produce details/name is displayed
        driver.findElement(By.cssSelector("#content > div:nth-child(1) > div.col-sm-4 > ul")).isDisplayed();
        // this code assert if the price is displayed
        driver.findElement(By.cssSelector("#content > div:nth-child(1) > div.col-sm-4 > ul:nth-child(4")).isDisplayed();

        //this code is to add item to cart
        driver.findElement((By.id("button-cart"))).click();

        //this code is to check if success message for addition of item to cart is displayed
       if(driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).isDisplayed())
       {
           System.out.println("Success message is displayed");
       }
       else

       {
           System.out.println("Success message is absent");
       }

       //this code is to click on item menu
        driver.findElement(By.xpath("//*[@id=\"cart-total\"]/i")).click();
       //this code is to view cart added

        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong/text()")).click();
       // throw new PendingException();


    }

    //this code clicks on items added to checkout


    @When("^I click checkout menu$")
    public void i_click_checkout_menu() throws Throwable {

        driver.findElement(By.linkText("Checkout")).click();

        //throw new PendingException();
    }

    @Then("^I can pay$")
    public void i_can_pay() throws Throwable {
        driver.findElement(By.cssSelector("#content > h1")).isDisplayed();

        // Customer enters billing details
        driver.findElement(By.id("input-payment-firstname")).sendKeys("Abimbola");
        driver.findElement(By.name("lastname")).sendKeys("biliion");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("1 lekki road");
        driver.findElement(By.id("input-payment-city")).sendKeys("Lagos");
        driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]")).sendKeys("2353636");
        //select country

       driver.findElements(By.xpath("//*[@id=\"input-payment-country\"]/option[Nigeria]"));

        //throw new PendingException();
    }
}
