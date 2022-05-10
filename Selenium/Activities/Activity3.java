package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
                // Create a new instance of the Firefox driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(10000);

        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //Find the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Saahil");
        lastName.sendKeys("Sharma");

        //Enter the email
        driver.findElement(By.id("email")).sendKeys("test@example.com");

        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("1234567890");

        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        //Close the browser
        driver.close();
    }
}