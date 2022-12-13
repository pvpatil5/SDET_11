package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {


	@Test
	public void launchbrowser()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		

	}

}
