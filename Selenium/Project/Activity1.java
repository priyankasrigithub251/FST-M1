package FST_SeleniumProject;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    static WebDriver driver;

    //Verify the website title
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        Thread.sleep(5000);
        String title=driver.getTitle();
        Assert.assertEquals("Alchemy LMS – An LMS Application",title);
        System.out.println("Title Match is successful");

        //Close browser
        driver.close();

    }
    }
