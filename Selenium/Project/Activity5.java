package FST_SeleniumProject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

    static WebDriver driver;

    //Navigate to the “My Account” page on the site.
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();

        //Wait for link to click
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        System.out.println("My account clicked");
        //Verify that you are on the correct page
        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://alchemy.hguy.co/lms/my-account/",url);
        System.out.println("Assertion passed");
        //Close browser
        driver.close();

    }
}
