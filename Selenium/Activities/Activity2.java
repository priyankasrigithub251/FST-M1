package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2  {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\002K2V744\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(10000);
        //Create a new instance of the Chrome driver


        //And now use this to visit the website
        driver.get("https://www.training-support.net");
        Thread.sleep(1000);
        //Check the title of the page
        String title = driver.getTitle();
        Thread.sleep(5000);
        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Find the About Us link using id()
        WebElement idLocator = driver.findElement(By.id("about-link"));
        Thread.sleep(5000);
        System.out.println("Text in element: " + idLocator.getText());

        //Find the About Us link using className()
        WebElement classNameLocator = driver.findElement(By.className("green"));
        Thread.sleep(5000);
        System.out.println("Text in element: " + classNameLocator.getText());

        //Find the About Us link using cssSelector()
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        Thread.sleep(5000);
        System.out.println("Text in element: " + cssLocator.getText());

        //Find the About Us link using linkText()
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        Thread.sleep(5000);
        System.out.println("Text in element: " + linkTextLocator.getText());

        //Close the browser
        driver.close();
    }
}