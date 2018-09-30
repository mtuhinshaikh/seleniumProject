package basic;

import framework.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class NavigateCommands extends DriverWrapper {

    @Test
    void navigateCommands() throws InterruptedException {
        //  getDriver().navigate().to("put the url");
        getDriver().findElement(By.xpath("//span[@class='nav-sprite nav-logo-base'][contains(text(), 'Amazon')]")).click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
        getDriver().navigate().refresh();


    }
}
