package com.sales.pctraders.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.google.common.io.Files;

public class BaseClass
{

	WebDriver driver;
	static WebDriver sdriver;

	@BeforeSuite
	public void launch() {
		driver = new ChromeDriver();
		sdriver=driver;
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}


	@AfterSuite
	public void close() {
		driver.close();
	}

	public static String takescreenshot(String methoname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/screenshot/"+methoname+".png";
		File dest = new File(path);
		Files.copy(src, dest);
		return path;
	}

}
