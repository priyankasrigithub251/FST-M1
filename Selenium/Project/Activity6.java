package FST_SeleniumProject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.linkText;

public class Activity6 {

    static WebDriver driver;

    //Logging into the site
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        //Get title and compare
        String title=driver.getTitle();
        Assert.assertEquals("My Account – Alchemy LMS",title);
        System.out.println("Assertion for Title passed");
        //Find the “Login” button on the page and click it
        driver.findElement(By.xpath("//*[@id=\"uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91\"]/div[2]/div[2]/a")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        System.out.println("Login is Successful");
        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://alchemy.hguy.co/lms/my-account/",url);
        System.out.println("Assertion for Successful Login passed");
        //Close browser
        driver.close();

    }
}
