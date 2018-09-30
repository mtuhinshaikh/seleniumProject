import framework.DriverWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class ScreenShot extends DriverWrapper {

    private String imagePath = "/Users/tuhinshaikh/Desktop/SeleniumScreenShot/image.PNG";
    File tempFile, permanentFile;
    TakesScreenshot screenshot;
    /*
    when you first take screen shot, it is put in clip board /tem file
    then you need to copy it to permanent file
     */

    @Test
    public void takeScreenShot() throws Exception {
        permanentFile = new File(imagePath);

        if (permanentFile.exists()) {
            throw new Exception("File with same name exits");
        }

        /*
        the driver does not have the method to take screen shot.
        so we cast screenShot interface to web driver
        meaning that the web driver now has the ability to take the screen shot.
         */

        screenshot = (TakesScreenshot) getDriver();
        tempFile = screenshot.getScreenshotAs(OutputType.FILE);// taking this screen shot
        FileUtils.copyFile(tempFile, permanentFile);// copying from temp file to permanent file.


    }
}
