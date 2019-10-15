package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static stepdefs.Gftshp_loginsteps.driver;

public class SellerRegStepdef {
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
    public void iClickMyAccntOptnsMenuOption() {

        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.caret")).click();
        driver.findElement((By.linkText("Login"))).click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("nicholasobagunle@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("nicholas");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    }

    @And("^I clck Register menu optn$")
    public void iClckRegisterMenuOptn() {
    }
}
