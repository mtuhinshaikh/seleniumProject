package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by tuhinshaikh on 9/30/18.
 */
public class DependsOn {
    WebDriver driver;


    @Test
    void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/tuhinshaikh/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);


    }

    @Test(dependsOnMethods = {"openBrowser"})
    void logIn() {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("tuhinshaikh@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Shaikh89@");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    @AfterTest
    void quitbrowser() {
        driver.quit();
    }
}
