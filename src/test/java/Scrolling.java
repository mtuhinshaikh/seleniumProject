import framework.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class Scrolling extends DriverWrapper {

    // To scroll we need help from JavaScript Executor
    JavascriptExecutor jse;


    @Test
    public void scroll() {
     /*
     Since the driver does not have the java script functionalist so
     we cast our driver to get the ability of java script executor.
      */
        jse = (JavascriptExecutor) getDriver();

        //Way 1
        //  jse.executeScript("scroll(0,800)");
        /*
        Here we are telling the JavaScript Executor to
        execute a script. we write the script in the parentheses.
         */

        // Way 2
        WebElement myelement = getDriver().findElement(By.xpath("//span[@class ='a-color-base'][contains(text(),'Today')]"));
        // Now find out the co-ordinate of this particular element.
       /* int x = myelement.getLocation().x;
        int y = myelement.getLocation().y;
        String command = String.format("window.scrollTo(%d, %d)", x, y);
        jse.executeScript(command);*/




    }
}
