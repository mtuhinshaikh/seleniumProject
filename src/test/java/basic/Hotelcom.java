package basic;

import framework.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by tuhinshaikh on 9/28/18.
 */
public class Hotelcom extends DriverWrapper {

    @Test
    void getHotelList() throws InterruptedException {

        //Create object of WebDriverWait class
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);


        WebElement element;
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='qf-0q-destination']")));

        element.sendKeys("Tampa");
        List<WebElement> list = getDriver().findElements(By.xpath("tbody[@class='autosuggest-city']"));


        for (WebElement selection : list) {

            if
                    (selection.getText().contains("Tampa, Florida")) {
                selection.click();

                Thread.sleep(5000);
                break;
            }
        }

        for (WebElement name : list) {
            String placename = name.getText();
            System.out.println(placename);
        }


    }

}
