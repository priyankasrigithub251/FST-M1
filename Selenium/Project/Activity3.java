package FST_SeleniumProject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

    static WebDriver driver;

    //Verify the title of the first info box
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        Thread.sleep(5000);
        String heading= driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']")).getText();

        Assert.assertEquals("Actionable Training",heading);
        System.out.println("Title of the first info box- Match is successful");

        //Close browser
        driver.close();

    }
}
