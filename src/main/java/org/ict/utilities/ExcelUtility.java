package org.ict.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelsheet;
	
	public static String getData(int rowNum,int colNum) throws IOException
	{
		
	FileInputStream inp=new FileInputStream("D:\\works java\\CurriculumTrackerApp\\src\\main\\resources\\TestData.xlsx");
	
	excelWbook=new XSSFWorkbook(inp);
	excelsheet=excelWbook.getSheetAt(0);
	return excelsheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	
				 

}

}
