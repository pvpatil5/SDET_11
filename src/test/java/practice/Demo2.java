package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.sales.pctraders.generic.ReadData_propfile;

public class Demo2 {


	@Test
	public void launchbrowser() throws IOException
	{

		WebDriver driver=null ;
		ReadData_propfile data_propfile = new ReadData_propfile();
		String browser=data_propfile.redadatafrompropfile("browser");
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
					}
		if(browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		if(browser.equals("edge")) {
			driver= new InternetExplorerDriver();
		}
		driver.get("https://www.amazon.com");
		

	}

}
