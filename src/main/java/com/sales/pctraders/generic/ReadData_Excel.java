package com.sales.pctraders.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excel 
{

	public String readDataExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fileInputStream = new FileInputStream(IAutoConstants.EXCELPATH)	;
	Workbook workbook=WorkbookFactory.create(fileInputStream);
	String value=workbook.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
	
	public String readDataExcel(String path,String sheetname,int row,int cell) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fileInputStream = new FileInputStream(path)	;
	Workbook workbook=WorkbookFactory.create(fileInputStream);
	String value=workbook.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
}
