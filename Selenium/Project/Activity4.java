package FST_SeleniumProject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4 {

    static WebDriver driver;
    static WebDriverWait wait;

    //Verify the title of the second most popular course
    public static void main(String[] args) throws InterruptedException {
        //Set path of Chrome driver and Instantiate browser driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(args[0]).toString();

        //String heading=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[@class='entry-title']"))).toString();
        String heading= driver.findElement(By.xpath("//h3[@class='entry-title']")).getText();

        Assert.assertEquals("Email Marketing Strategies",heading);
        System.out.println("Email Marketing Strategies- Text Match is successful");
        //Close browser
        driver.close();

    }
}
