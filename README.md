# Blueskycitadel-TeamWebdriver
### Manual Testing
Software Testing is the process of verifying and validating a software application and ensuring that it meets specied required specification.
There is no exhaustive testing as a tester, my duty is minimize defects.
The skills required for Software Testing includes Communication skills, SQL Skills to query database, Hands on experience on Test Management tool like Azure Deveops,JIRA and Test Rail
Eye for details to detect defects,quality bug reporting skills.

**Defect Life cycle**  
-Reproduce the defect  
-Assign the defect a priority and severity  
-Assign the defect to the development team  
-Retest the defect when fixed    
-Close the defect  

**Types of Testing**  
Manual Testing: process of testing an application to ensure it meets specified requirement.  
Acceptance Testing:is a test conducted whether to accept or reject a software application.  
System End-to-End Testing: Is the testing of software application to uncover defects.   
Functional Testing: This is testing the functional areas in an application.  
Performance Testing: is testing an application to ensure that it performs as expected.  


**Behaviour Driven Development using Gherkins**
 
BDD helps to narrow communication gap between the development team wit real world examples. It also encorages collaboration between QA, developer and the non-technical participants

A feature file describes the single feature of a system. I can have multiple testcases. Feature can be likened to scenario
A background can be used in feature file if there repetitive steps
Here is an example of a Gherkin Language

**Feature**: Login Functionality

**Scenario**: Valid Login

**Given** I am on the Giftshop website  
**When** I click on login button  
**And** I enter user name   
**And** I enter password  
**And** I click on login button  
**Then** I am logged in

Testcase  
A testcase describes the test condition for a test scenario. It is composed of Testcase ID, Testcae scenario, Actual Result, Expected Result and Result/Status  

A sample testcase for myproject  

![image](https://user-images.githubusercontent.com/43099966/68214208-4e6afb00-ffdd-11e9-8438-5de7dfd21fc2.png)


# Automation Test with Selenum+JAVA+Cucumber+TESTNG+MAVENS+Intellij

Steps to follow  
STEP 1: Install Java JDK 12 from https://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html  
STEP 2: Configure variable environment   
i) Set the Java Home in Advanced System Settings on PC  
ii) Update PATH  
STEP 3: Install Maven  
a)Set Maven Home Path in Advanced System Settings
STEP 4: Install Intellij  
a)Configure path in intellij  
b)Update POM file  

**1.JAVA INSTALLATION**

Download java from https://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html

![image](https://user-images.githubusercontent.com/43099966/68091384-4f861600-fe7f-11e9-867a-1911eeff38a9.png)    

Procced to the next window

![image](https://user-images.githubusercontent.com/43099966/68128862-d3d8a780-ff18-11e9-9978-045a820abf37.png)


**2.CONFIGURING VARIABLE**   
a) Set the Java Home:
You search for Advanced setting on your PC searching for Advanced settingd in search window on your PC >> Click on Advanced settings Tab >> Click on Environmental Variable >> Click on New menu >> Add JAVA_HOME >>Enter the variable value "C:\programfiles\jdk 13.0 >> Click Ok








b) Update PATH  
Click on Path on the System variable >> find path and add "\;%JAVA_HOME%\bin"
 

**3.INSTALL MAVEN**  
Download Maven at "https://maven.apache.org/download.cgi"




**4.CONFIGURE MAVEN**  
You search for Advanced setting on your PC searching for Advanced settingd in search window on your PC >> Click on Advanced settings Tab >> Click on Environmental Variable >> Click on New menu >> Add MAVEN_HOME >>Enter the variable value "C:\apache-maven >> Click Ok  

Set Path as "%MAVEN_HOME%\bin"

**5.INSTALL INTELLIJ**  
Go to https://www.jetbrains.com/idea  
Notice: Install the community version  
Check the following



**6.CONFIGURE INTELLIJ**


**7.ADD CUCUMBER PLUGIN**

**8.UPDATE POM**  

properties>
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-jvm-deps</artifactId>
            <version>1.0.5</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>1.2.5</version>
            <scope>compile</scope>
            <exclusions>
                <exclusion>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.9.8</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>cucumber-reporting</artifactId>
            <version>3.8.0</version>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-api</artifactId>
            <version>3.11.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-support</artifactId>
            <version>3.11.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>3.11.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-firefox-driver</artifactId>
            <version>3.11.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>23.6-jre</version>
            <classifier></classifier>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-resources-plugin</artifactId>
                <version>2.4</version>
            </plugin>

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.14.1</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>

            <plugin>
                <groupId>net.masterthought</groupId>
                <artifactId>maven-cucumber-reporting</artifactId>
                <version>3.8.0</version>

                <executions>
                    <execution>
                        <id>execution</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>

                        <configuration>
                            <projectName>UITest4</projectName> <!-- Replace with project name -->
                            <outputDirectory>target/cucumber-reports/advanced-reports</outputDirectory>
                            <cucumberOutput>target/cucumber-reports/CucumberTestReport.json</cucumberOutput>
                            <buildNumber>1</buildNumber>
                            <parallelTesting>false</parallelTesting>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

**9**. UPDATE TESTRUNNER  
import cucumber.api.CucumberOptions;

import cucumber.api.testng.TestNGCucumberRunner;

import cucumber.api.testng.CucumberFeatureWrapper;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {"stepdefs"},

        tags = {"~@Ignore"},

        format = {

                "pretty",

                "html:target/cucumber-reports/cucumber-pretty",

                "json:target/cucumber-reports/CucumberTestReport.json",

                "rerun:target/cucumber-reports/rerun.txt"

        })

public class TestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)

    public void setUpClass() throws Exception {

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")

    public void feature(CucumberFeatureWrapper cucumberFeature) {

        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());

    }

    @DataProvider

    public Object[][] features() {

        return testNGCucumberRunner.provideFeatures();

    }

    @AfterClass(alwaysRun = true)

    public void tearDownClass() throws Exception {

        testNGCucumberRunner.finish();

    }

}



**10.UPDATE TESTNG FILE**

<?xml version=”1.0″ encoding=”UTF-8″?>

<!DOCTYPE suite SYSTEM “http://testng.org/testng-1.0.dtd”>

<suite name=”BDD Test Suite” verbose=”1″ parallel=”tests” thread-count=”1″ configfailurepolicy=”continue”>

<test name=”Login and Update Profile Test” annotations=”JDK” preserve-order=”true”>

<classes>

<class name=”TestRunner”/>

</classes>

</test>

</suite>


**11.CREATE JAVA FILE**

##CREATE FEATURE FILE  
Feature: GiftShop Logout
  Scenario: Logout
    Given I am logged on to the Giftshop website
    When  I select Logout menu option
    Then   I am logged out of the giftrete website
    
    
 

**12.WRITE YOUR FIRST CODE IN STEPDEFINITION**

package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class logout_stepdef {
  public static  WebDriver driver;


    public void login(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }

    @Given("^I am logged on to the Giftshop website$")
    public void i_am_logged_on_to_the_Giftshop_website() throws Throwable {

        login();

        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.caret")).click();
        driver.findElement((By.linkText("Login"))).click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("nicholasobagunle@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("nicholas");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

       // throw new PendingException();
    }

    @When("^I select Logout menu option$")
    public void i_select_Logout_menu_option() throws Throwable {
        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.caret")).click();
        driver.findElement(By.linkText("Logout")).click();
        //throw new PendingException();
    }
    @Then("^I am logged out of the giftrete website$")
    public void i_am_logged_out_of_the_giftrete_website() throws Throwable {
       if(driver.findElement(By.cssSelector("#content > h1")).isDisplayed()){
           System.out.println("Element is Visible");
       }
       else{
           System.out.println("Element is Absent");
       }
        //throw new PendingException();
    }

}


















 

