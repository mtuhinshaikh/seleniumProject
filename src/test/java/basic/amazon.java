package basic;

import framework.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/28/18.
 */
public class amazon extends DriverWrapper {


    @Test
    public void searchAmazon() {
        getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("nike socks men");
        getDriver().findElement(By.xpath("//input[@type='submit'][@class='nav-input']")).click();
        String searchResult = getDriver().findElement(By.xpath("//span[@id='s-result-count']")).getText();
        System.out.println(searchResult);


    }
}
