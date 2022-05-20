package suiteExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(10000);

        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 0)
    public void getTitle() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals(title,"Target Practice" );

        System.out.println("Assert passed");
    }
    @Test(priority = 1)
    public void findElementMethod() throws InterruptedException {
        //Find Arrow element

        driver.findElement(By.xpath("/html/body/div/div[1]/button/i"));
        //Get Current URL for Assertion
        String url=driver.getCurrentUrl();
        //Fail an Assertion
        Assert.assertEquals("https://www.training-support.net/selenium/targetpractice",url);
        Thread.sleep(5000);
    }
    @Test(enabled = false)
    public void skipMethod()
    {
        System.out.println("First Test to skip");
    }
    @Test
    public void SkipTest() throws SkipException {
        System.out.println("Second Test to skip");
        throw new SkipException("Skipping 2nd Test- This is not ready for testing ");

          }
    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.quit();
    }

}

