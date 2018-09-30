package data_driven_testing;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExcelData {

    private InputStream oFileReader;
    private Workbook oExcelWorkbook;
    private String sExcelFileName;

    public Object[][] createDataArray(String sFileName, String sSheetName) {

        String[][] dataArray = null;
        openExcelWorkbook(sFileName);
        int ci, cj;
        int rows = getRowCountofSheet(sSheetName);
        int cells = getCellCount(sSheetName, 1);
        dataArray = new String[rows][cells];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                dataArray[i][j] = getCellData(sSheetName, i, j);
                System.out.println(dataArray[i][j]);
            }
        }

        return dataArray;
    }

    public void openExcelWorkbook(String sFileName) {
        try {
            oFileReader = new FileInputStream(sFileName);
            oExcelWorkbook = WorkbookFactory.create(oFileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int getRowCountofSheet(String sSheetName) {

        try {
            Sheet oSheet;
            oSheet = oExcelWorkbook.getSheet(sSheetName);
            System.out.println("Sheet Name :" + sSheetName);
            return oSheet.getPhysicalNumberOfRows();
        } catch (Exception e) {
            e.printStackTrace();

            return -1;
        }


    }


    public int getCellCount(String sSheetName, int iRow) {
        try {
            Sheet oSheet;
            Row oRow;
            oSheet = oExcelWorkbook.getSheet(sSheetName);
            oRow = oSheet.getRow(iRow - 1);
            return oRow.getLastCellNum();

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


    public String getCellData(String sSheetName, int iRow, int iCell) {
        try {
            Sheet oSheet;
            oSheet = oExcelWorkbook.getSheet(sSheetName);
            Row oRow;

            oRow = oSheet.getRow(iRow);
            Cell oCell;
            oCell = oRow.getCell(iCell);
            if (oCell == null) {
                return "";
            } else {
                if (oCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                    System.out.println("Cell Value: " + String.valueOf((long) oCell.getNumericCellValue()));
                    return String.valueOf((long) oCell.getNumericCellValue());
                } else {
                    System.out.println("String cell value: " + oCell.getStringCellValue());
                    return oCell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
