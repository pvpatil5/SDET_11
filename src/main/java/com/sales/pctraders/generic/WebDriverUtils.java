package com.sales.pctraders.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils 
{
	// This class is gonna have webdriver methods
	
	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	public void waitforpageload()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void maximizewindow() {
		driver.manage().window().maximize();
	}
	public void manimisewindow() {
		driver.manage().window().minimize();
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	
	public void dropdown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void dropdown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void dropdown(String text,WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
