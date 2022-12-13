package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatafrom_Excel2
{
	@Test
	public void readData_excel() throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream("../SDET11/data/SDET11.xlsx");

		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);

		for (int i = 0; i <=rownum ; i++) 
		{
			String value=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}


	}


}
