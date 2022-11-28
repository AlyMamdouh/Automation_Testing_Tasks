package Challenge_18_Main;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel_Data_Reader

{
    @DataProvider(name = "test_data")
    public Object[][] Read_Sheet() throws IOException
    {
        File myfile=new File("C:\\Users\\aabdelhamid\\IdeaProjects\\TCoETraining\\src\\main\\java\\Challenge_18_Main\\invalidData.xlsx");

        FileInputStream fis = new FileInputStream(myfile);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet mysheet=wb.getSheet("Sheet1");
        int number_of_rows=mysheet.getPhysicalNumberOfRows();
        int number_of_columns=mysheet.getRow(0).getLastCellNum();
        String[][] myarray=new String[number_of_rows-1][number_of_columns];

        for (int i=0 ;i < number_of_rows-1;i++)
        {
            for(int a=0; a< number_of_columns;a++)
            {
                DataFormatter df = new DataFormatter();
                myarray[i][a] = df.formatCellValue(mysheet.getRow(i+1).getCell(a));
                System.out.println(myarray[i][a]);
            }
        }
        wb.close();
        fis.close();
        return myarray;
    }

}


