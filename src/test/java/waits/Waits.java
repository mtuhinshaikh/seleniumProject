package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class Waits {

    private static final String amazon = "https://www.amazon.com/";

    @Test
    void test() {

        System.setProperty("webdriver.chrome.driver",
                "/Users/tuhinshaikh/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(amazon);

        //Time Synchronization
        // To give the page 45 secs to load
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        // Implicit waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Explicit waits.
        // put condition


        WebDriverWait myWait = new WebDriverWait(driver, 30);
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("putlocatior")));
        // you can customized your condition here and do your next step.


    }
}
