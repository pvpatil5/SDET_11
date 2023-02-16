package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropFile 
{
	@Test
	public void reaDatafromPropfile() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("../SDET11/data/Propfile.properties");

		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value=properties.getProperty("name");
		System.out.println(value);
		
	}
}
