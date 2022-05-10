package FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Activity7 {

    static WebDriver driver;

    //Count the number of courses
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
        //Identify the courses
        List<WebElement> links=driver.findElements(By.xpath("//a[text()='See more...']"));
        //Get the count of Courses
        int courseCount=links.size();
        //Print the count of Courses
        System.out.println("Number of courses are: "+courseCount );
        //Close browser
        driver.close();

    }
}
