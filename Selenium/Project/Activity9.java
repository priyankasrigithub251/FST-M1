package FST_SeleniumProject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity9 {

    static WebDriver driver;
    //Complete a simple lesson
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
        //Click All Courses link
        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
        driver.findElement(By.xpath("//*[@id=\"post-69\"]/a/img")).click();
        System.out.println("Social Media Marking is clicked");
        //Find the “Login” button on the page and click it
        driver.findElement(By.xpath("//a[text()='Login to Enroll']")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        driver.findElement(By.xpath("//*[@id='ld-expand-83']/div[1]/a/div[1]")).click();
        String title= driver.getTitle();
        Assert.assertEquals("Developing Strategy – Alchemy LMS",title);
        System.out.println("Title matched");

        //Close browser
        driver.close();

    }
}
