package basic;

import framework.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/28/18.
 */
public class FBLogin2 extends DriverWrapper {

    @Test
    public void goToFB() {
        getDriver().findElement(By.id("email")).sendKeys("tuhinshaikh@gmail.com");
        getDriver().findElement(By.id("pass")).sendKeys("Shaikh89@");
        getDriver().findElement(By.xpath("//input[@type='submit'][contains(text(),'')]")).click();
    }
}
