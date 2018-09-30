package framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


/**
 * Created by tuhinshaikh on 9/28/18.
 */
public class DriverWrapper {

    private static WebDriver driver = null;

    private static final String FBURL = "https://facebook.com/";
    private static final String alertURL = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
    private static final String calender = "https://www.hotels.com/";
    private static final String autoComplete = "https://www.expedia.com/";
    private static final String hoverOver = "https://dhtmlx.com/";
    private static final String amazon = "https://www.amazon.com/";
    private static final String Darksky = "https://darksky.net";
    private static final String google = "https://www.google.com/";
    private static final String letskodeit = "https://learn.letskodeit.com";
    private static final String demostore = "https://demostore.x-cart.com/";
    private static final String southeastAir = "https://www.southwest.com/";
    private static final String DragAndDrop = "https://jqueryui.com/droppable/";
    private static final String slider = "https://jqueryui.com/slider/";


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void initializeWebDriver() {

        System.setProperty("webdriver.chrome.driver",
                "/Users/tuhinshaikh/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);


        driver.get(FBURL);


        driver.manage().window().fullscreen();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();


        }
    }
}
