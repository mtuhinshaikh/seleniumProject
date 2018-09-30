package data_driven_testing;

public class GetCurrentDirectory {

    public static void main(String[] args) {

        String currentDirectory;
        currentDirectory = System.getProperty("user.dir");

        String excelfile = currentDirectory + "/Data/Workbook.xlsx";
        System.out.println("Current working directory : " + currentDirectory);
        System.out.println(excelfile);
    }
}
