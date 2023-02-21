package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ReportCreation 
{

	@Test
	public void createreport() throws IOException 
	{
		// look and feel of report
		ExtentSparkReporter reporter;

		ExtentReports reports;

		//ExtentTest test;

		reporter = new ExtentSparkReporter("./target/Report3.html");
		reporter.config().setDocumentTitle("Facebbok");
		reporter.config().setTheme(Theme.DARK);


		reports= new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("QA", "Pavan");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Build No", "123");

		ExtentTest test = reports.createTest("hello");

		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		String path="./screenshot/pic.png";

		File dest = new File(path);

		Files.copy(src, dest);
		
		String path1=System.getProperty("user.dir")+path;
		test.addScreenCaptureFromPath(path1);
		test.log(Status.FAIL, "Name of the method --> got failed");
		
		System.out.println(driver.getTitle());

		reports.flush();
		
		

		Assert.assertEquals(false, true);


	}

}
