package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatafrom_Excel
{
	@Test
	public void readData_excel() throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream("../SDET11/data/SDET11.xlsx");
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		int value=(int) workbook.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value);

	}


}
