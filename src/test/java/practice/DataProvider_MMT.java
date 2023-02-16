package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_MMT 
{

	@Test(dataProvider = "getdata")
	public void dataproviver(String s1,String s2) throws InterruptedException 
	{

		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();

		Actions action = new Actions(driver);
		action.moveByOffset(10, 10).click().build().perform();

		//driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		driver.findElement(By.id("fromCity")).sendKeys(s1);

		driver.findElement(By.xpath("//div[text()='"+s1+"']")).click();

		driver.findElement(By.id("toCity")).sendKeys(s2);

		driver.findElement(By.xpath("//div[text()='"+s2+"']")).click();
		
		action.moveByOffset(10, 10).click().build().perform();
		
//		boolean flag=driver.findElement(By.xpath("//div[@aria-label='Wed Feb 08 2023']")).isEnabled();
//
//		System.out.println(flag);


	}

	@DataProvider
	public Object[][] getdata() 
	{

		Object arr[][] = new Object[3][2];

		arr [0][0]="BOM";
		arr [0][1]="PNQ";

//		arr[1][0]="BLR";
//		arr[1][1]="CCU";
//
//		arr[2][0]="DEL";
//		arr[2][1]="HYD";
		return arr;


	}

}
