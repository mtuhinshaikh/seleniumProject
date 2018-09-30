package data_driven_testing;

import org.testng.annotations.Test;
import framework.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLogin extends DriverWrapper {

    ReadExcelData data;


    @DataProvider(name = "LC")
    public Object[][] LoginCredentials() {

        String currentDirectory;
        currentDirectory = System.getProperty("user.dir");

        String excelfile = currentDirectory + "/Data/Workbook.xlsx";

        data = new ReadExcelData();
        Object[][] cred = data.createDataArray(excelfile, "Sheet1");

        return cred;
    }

    @Test(dataProvider = "LC")
    public void testLogIng(String userid, String password) {
        getDriver().findElement(By.id("email")).sendKeys(userid);
        getDriver().findElement(By.id("pass")).sendKeys(password);
        getDriver().findElement(By.xpath("//input[@type='submit'][contains(text(),'')]")).click();
    }


}
