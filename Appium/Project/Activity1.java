package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.By.xpath;

public class Activity1 {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "emulator-5554");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 20);
    }


    @Test(priority = 0)
    public void googleTask() {
        // Wait for app to load
        //Add First Task
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(new By.ById("com.google.android.apps.tasks:id/add_task_title"))).sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        //Add Second Task
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(new By.ById("com.google.android.apps.tasks:id/add_task_title"))).sendKeys("Complete Activity with Google Keep");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        //Add Third Task
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(new By.ById("com.google.android.apps.tasks:id/add_task_title"))).sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        //Assertion to ensure all three tasks have been added
        String assert1=wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']"))).getText();
        String assert2=wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']"))).getText();
        String assert3=wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']"))).getText();


        // Assertion
        Assert.assertEquals(assert1, "Complete the second Activity Google Keep");
        Assert.assertEquals(assert2, "Complete Activity with Google Keep");
        Assert.assertEquals(assert3, "Complete Activity with Google Tasks");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}