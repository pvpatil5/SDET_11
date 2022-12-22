package com.sales.pctraders.customer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sales.pctraders.generic.ReadData_Excel;
import com.sales.pctraders.generic.ReadData_propfile;
import com.sales.pctraders.generic.TestDataCreation;

public class TC_113_CreateCustomerTest {

	@Test
	public void createcustmer() throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ReadData_propfile data_propfile = new ReadData_propfile();
		String url=	data_propfile.redadatafrompropfile("url");
		driver.get(url);
		String UN=data_propfile.redadatafrompropfile("username");
		String pwd=data_propfile.redadatafrompropfile("password");
		driver.findElement(By.name("user")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnlogin")).click();

		//Afetr Logging in alert is appering

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//span[text()='Customer']")).click();

		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();

		ReadData_Excel data_Excel = new ReadData_Excel();
		String fname=data_Excel.readDataExcel("Sheet2", 0, 0);
		String lname=data_Excel.readDataExcel("Sheet2", 0, 1);
		String phno=data_Excel.readDataExcel("Sheet2", 0, 2);
		
		TestDataCreation dataCreation = new TestDataCreation();
		int number=dataCreation.generateRandomNumber();
		String name=fname+number;
		System.out.println(name);
		
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("phonenumber")).sendKeys(phno);

		driver.findElement(By.xpath("//h5[.='Add Customer']/ancestor::div[@id='customerModal']//button[.='Save']")).click();

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name);

		String actualname=driver.findElement(By.xpath("//td[@class='sorting_1']")).getText();


		if(actualname.equalsIgnoreCase(name))
		{
			System.out.println("test pass");
		}
		else {
			System.out.println("fail");
		}

		driver.findElement(By.xpath("//img")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();

	}

}
