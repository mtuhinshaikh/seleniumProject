package data_driven_testing;

import framework.DriverWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class ExcelHandling extends DriverWrapper {

    /*
    Steps to read Excel Data:
    1. File Location, bring the work book sheet into the stream
    2. Open the file/workbook
    3. Get the Sheet
    4. Get the Number of Rows
    5. Start the outer loop-- This will go through the rows.
    6. Get the number of Columns and Start the loop-- this loop will get the number of columns.
    7. Get the data from cell.
     */

    Workbook myBook;
    Sheet mySheet;
    Row myRow;
    Cell myCells;
    int rowCount;
    String file = "/Users/tuhinshaikh/Desktop/Workbook.xlsx";

    String email, pass;

    private Object[][] getdata = new Object[4][2];


    public void readData() {

        try {
            /*
            we are using the workbookFactory because it internally
            decide what kind of file format to create.
            for older version of excel, HSSf, xls, It will create the relevant file,
            for new file format, XSSF, It will create xlsx.
             */
            myBook = WorkbookFactory.create(new FileInputStream(file));
            //  mySheet = myBook.getSheet("sheet name");
            mySheet = myBook.getSheetAt(0);
            // rowCount = mySheet.getLastRowNum(); // this function uses indexing. we have four row. so, it will return 3.
            rowCount = mySheet.getPhysicalNumberOfRows();// This will return only filled rows.
            //  System.out.println(rowCount);

            for (int i = 0; i < rowCount; i++) {
                myRow = mySheet.getRow(i);// this will bring the row, and even if there are different number of column it will work
                for (int j = 0; j < myRow.getLastCellNum(); j++) {

                    myCells = myRow.getCell(j);

                    CellType type = myCells.getCellTypeEnum();
                    if (type == CellType.NUMERIC) {
                        //  System.out.print(myCells.getNumericCellValue() + " ");
                        getdata[i][j] = myCells.getNumericCellValue();
                    } else {
                        // System.out.print(myCells.getStringCellValue() + " ");
                    }

                }
                System.out.println("");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExcelHandling obj = new
                ExcelHandling();

        obj.readData();

    }

    @Test
    void FbLogin() {

        for (int x = 0; x < getdata.length; x++) {

            email = getdata[x][0].toString();
            pass = getdata[x][1].toString();


            getDriver().findElement(By.id("email")).sendKeys(email);
            getDriver().findElement(By.id("pass")).sendKeys(pass);
            getDriver().findElement(By.id("u_0_2")).click();
        }

    }


}
