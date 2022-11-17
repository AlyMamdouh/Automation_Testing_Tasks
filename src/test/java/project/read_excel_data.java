package project;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class read_excel_data
{
    public Object[][] read_sheet() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        File myfile=new File("C:\\Users\\aabdelhamid\\IdeaProjects\\Induction\\src\\main\\java\\Stage2\\validData.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(myfile);
        XSSFSheet mysheet=wb.getSheet("Sheet1");
        int number_of_rows=mysheet.getPhysicalNumberOfRows();
        int number_of_columns=mysheet.getRow(0).getLastCellNum();
        String[][] myarray=new String[number_of_rows-1][number_of_columns];

        for (int i=1;i < number_of_rows;i++)
        {
            for(int a=0; a< number_of_columns;a++)
            {
                XSSFRow row=mysheet.getRow(i);
                myarray[i-1][a]=row.getCell(a).getStringCellValue();
            }
        }
        return myarray;
    }

}


