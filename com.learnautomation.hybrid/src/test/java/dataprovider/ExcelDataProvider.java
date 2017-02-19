package dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


// This class will load excel sheet
public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		
	
		
		File src=new File(System.getProperty("user.dir")+"/TestData/Data.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			 wb=new XSSFWorkbook(fis);
		} 
		catch (Exception e) {
		
			System.out.println("Unable to load excel");
			System.out.println(e.getMessage());
			
		}
	
	}
	
	
	public String getData(String sheetname,int row,int column)
	{

		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	
	
}
