package FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity8 {

    static WebDriver driver;

    //Contact the admin
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
        //Click the Contacts link
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        //Fill the form
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Priyanka Srivastava");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("priyankasri251@gmail.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Alchemy LMS Course Registration Form");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("This is a form to for Alchemy LMS Course Registration");
        driver.findElement(By.id("wpforms-submit-8")).click();
        String confirmMsg=driver.findElement(By.id("wpforms-confirmation-8")).getText();
        System.out.println(confirmMsg);

        //Close browser
        driver.close();

    }
}
