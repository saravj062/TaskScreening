package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	

	/*Main method that is calling the ExcelReader method*/

	public static void Main(String filePath,String fileName,String sheetName) throws Exception
		{
		
		ExcelReader exlread = new ExcelReader();
		exlread.readexcelfile("D:\\Shanthi_Selenium\\Data Driven Framework_Selenium\\DDF\\src\\com\\ExcelFiles", "SuiteOne.xls", "TestCasesList");
		}


	public void readexcelfile(String filePath,String fileName,String sheetName) throws Exception
	{
		File file = new File(filePath+"\\"+fileName);
		
		FileInputStream inputstream = new FileInputStream(file);
		
		Workbook wb = new HSSFWorkbook(inputstream);
		Sheet sh = wb.getSheet(sheetName);
		
		int rowcount;
		rowcount = sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int i=0;i<rowcount+1;i++)
		{
			Row rw = sh.getRow(i);
			
			for(int j=0;j<rw.getLastCellNum();j++)
			{
				Cell cl = rw.getCell(j);
				System.out.print(rw.getCell(j).getStringCellValue()+"|| ");
			}
			
		}
		
	}


}