package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gclid=CjwKCAiAuOieBhAIEiwAgjCvckc077spgSY5H1YVtTJ5BBBi-7eVQPmrQ6TVujzeSu07ICqWgp-wERoCOi0QAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();

		WebElement element=driver.findElement(By.xpath("//p[@class='sc-bYoBSM eyNSEu fswWidgetPlaceholder']"));
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].click();", element);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input")).sendKeys("Mumbai");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Mumbai')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input")).sendKeys("Hyderabad");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Hyderabad')]")).click();
		 
		 
	}

}
