package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteData_Excel 
{
	@Test
	public void writeDatainExcelsheet() throws EncryptedDocumentException, IOException
	{
		FileInputStream fileInputStream = new FileInputStream("../SDET11/data/SDET11.xlsx");

		Workbook workbook=WorkbookFactory.create(fileInputStream);

		workbook.createSheet("Sheet2").createRow(0).createCell(0).setCellValue("Pavan");
		fileInputStream.close();
		FileOutputStream fileOutputStream = new FileOutputStream("../SDET11/data/SDET11.xlsx");
		workbook.write(fileOutputStream);
		fileOutputStream.close();
		workbook.close();

	}
}
