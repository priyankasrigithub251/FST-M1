package suiteExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(10000);

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void loginForm() throws InterruptedException {
        // Find Login Input field-Username
        WebElement username=driver.findElement(By.id("username"));

        // Find Login Input field-Password
        WebElement password=driver.findElement(By.id("password"));

        //Enter Username in username field
        username.sendKeys("admin");

        //Enter Username in Password field
        password.sendKeys("password");

        //Wait to see Login button click event
        Thread.sleep(5000);

        //Click on Login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        //Wait to see Confirmation Message
        Thread.sleep(5000);

        //Get Confirmation Message
        String confirmationMsg=driver.findElement(By.id("action-confirmation")).getText();
                //driver.findElement(By.xpath("//id[@text='Welcome Back, admin']")).getText();

        //Assertion for Confirmation Message
        Assert.assertEquals("Welcome Back, admin", confirmationMsg);

        //Print if Assert is True
        System.out.println("Assert passed");

    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.quit();
    }

}

