package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by tuhinshaikh on 9/28/18.
 * When the DriverWrapper was not in the package. It was not allowing to import.
 * once I created the package and put the driverwrapper class
 * it allowed me to import.
 */
public class FBLogin {

    WebDriver driver;

    @Test
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/tuhinshaikh/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("tuhinshaikh@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Shaikh89@");
        driver.findElement(By.id("u_0_2")).click();

        driver.quit();


    }


}
