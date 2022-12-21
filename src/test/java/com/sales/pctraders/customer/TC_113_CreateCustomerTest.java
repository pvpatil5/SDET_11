package com.sales.pctraders.customer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_113_CreateCustomerTest {

	@Test
	public void createcustmer() 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
		
		driver.findElement(By.name("user")).sendKeys("unguardable");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("btnlogin")).click();
		
		//Afetr Logging in alert is appering
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//span[text()='Customer']")).click();
		
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Soumya");
		driver.findElement(By.name("lastname")).sendKeys("Shaoo");
		driver.findElement(By.name("phonenumber")).sendKeys("123456");
		
		driver.findElement(By.xpath("//h5[.='Add Customer']/ancestor::div[@id='customerModal']//button[.='Save']")).click();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Soumya");
		
		String actualname=driver.findElement(By.xpath("//td[@class='sorting_1']")).getText();
		
		
		if(actualname.equalsIgnoreCase("soumya"))
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
