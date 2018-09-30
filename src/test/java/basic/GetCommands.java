package basic;

import framework.DriverWrapper;
import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class GetCommands extends DriverWrapper {

    @Test
    public void getCommand() {
        //getDriver().get("put your url. ");
        String title = getDriver().getTitle();
        System.out.println(title);
        String currentUrl = getDriver().getCurrentUrl();
        System.out.println(currentUrl);
        // String pageSource = getDriver().getPageSource();
        String windowHandle = getDriver().getWindowHandle();
        System.out.println(windowHandle);


    }
}
