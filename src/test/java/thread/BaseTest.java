package thread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public  static WebDriver getDriver() 
	{
		return driver.get();
	}

	private static void setDriver(WebDriver dr2) {
		driver.set(dr2);
	}

	public static  WebDriver driverinit() {
		WebDriver driver;
		driver= new ChromeDriver();
		return driver;
	}

	@BeforeSuite
	public  void bs() 
	{
		setDriver(driverinit());
		
	}
	@BeforeClass
	public void gotoURL() {
		getDriver().get("https://facebook.com");
	}

	@AfterClass
	public void ac() {
		getDriver().quit();
	}

}
