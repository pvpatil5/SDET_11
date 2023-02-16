package com.sales.pctraders.customer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sales.pctraders.generic.ReadData_Excel;
import com.sales.pctraders.generic.ReadData_propfile;
import com.sales.pctraders.generic.TestDataCreation;
import com.sales.pctraders.generic.WebDriverUtils;

public class TC_114_CreateSupplierTest {

	@Test
	public void createcustmer() throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		WebDriverUtils webDriverUtils = new WebDriverUtils(driver);

		webDriverUtils.maximizewindow();
		webDriverUtils.waitforpageload();


		ReadData_propfile data_propfile = new ReadData_propfile();
		String url=	data_propfile.redadatafrompropfile("url");
		driver.get(url);
		String UN=data_propfile.redadatafrompropfile("username");
		String pwd=data_propfile.redadatafrompropfile("password");
		driver.findElement(By.name("user")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnlogin")).click();

		//Afetr Logging in alert is appering

		webDriverUtils.acceptAlert();

		driver.findElement(By.xpath("//span[text()='Supplier']")).click();

		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();

		TestDataCreation dataCreation = new TestDataCreation();
		String cname =dataCreation.getCompanayName();
		driver.findElement(By.xpath("//input[@name='companyname']")).sendKeys(cname);

		driver.findElement(By.name("phonenumber")).sendKeys("123456");

		// Select provience from dropdown

		WebElement provinceelement=driver.findElement(By.id("province"));
		webDriverUtils.dropdown("Bataan", provinceelement);

		WebElement cityelement=driver.findElement(By.id("city"));
		webDriverUtils.dropdown(cityelement, 5);




		Thread.sleep(4000);
		driver.findElement(By.xpath("//h5[.='Add Supplier']/ancestor::div[@id='supplierModal']//button[.='Save']")).click();

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(cname);

		String actualname=driver.findElement(By.xpath("//td[@class='sorting_1']")).getText();


		if(actualname.equalsIgnoreCase(cname))
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
