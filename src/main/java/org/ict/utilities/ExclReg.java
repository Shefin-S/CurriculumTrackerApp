package org.ict.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExclReg {

public static XSSFWorkbook excelWbook;
public static XSSFSheet excelSheet,celltype;

 public static String getData(int rowNum,int colNum) throws IOException {
	
	 FileInputStream  inp=new FileInputStream("D:\\works java\\CurriculumTrackerApp\\src\\main\\resources\\register.xlsx");
	    excelWbook=new XSSFWorkbook(inp);
	    excelSheet=excelWbook.getSheetAt(0);
	    return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
 }
 public static long getNumericData(int rowNum,int colNum) throws IOException {
		
	 FileInputStream  inp=new FileInputStream("D:\\works java\\CurriculumTrackerApp\\src\\main\\resources\\register.xlsx");
	    excelWbook=new XSSFWorkbook(inp);
	    excelSheet=excelWbook.getSheetAt(0);
	    return (long)excelSheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
 }

}
