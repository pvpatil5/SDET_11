package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatafrom_Excel3
{
	@Test
	public void readData_excel() throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream("../SDET11/data/SDET11.xlsx");

		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		int lastrow=sheet.getLastRowNum();
		int lastcell=sheet.getRow(1).getLastCellNum();
		System.out.println(lastcell);

		for (int i = 0; i <= lastrow; i++)
		{
			for (int j = 0; j < 2; j++) 
			{
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
			}	
			System.out.println();
		}



	}


}
