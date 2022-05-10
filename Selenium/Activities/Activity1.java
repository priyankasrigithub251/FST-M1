package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
       static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(10000);

        // Open the browser
        driver.get("https://www.training-support.net");

        // Close the browser
        driver.close();
    }

}
