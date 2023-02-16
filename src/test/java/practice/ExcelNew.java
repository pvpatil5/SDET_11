package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelNew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream("../SDET11/New Microsoft Excel Worksheet.xlsx");

		String s1=WorkbookFactory.create(fileInputStream).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(s1);

	}

}
