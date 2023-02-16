package practice;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cladendar {

	public static void main(String[] args) throws InterruptedException {

		Date d = new Date();
		String date_and_time=d.toString();
		// Wed Dec 21 15:31:07 IST 2022
		// 0    1   2    3      4    5
		String[] a = date_and_time.split(" ");

		String day=	a[0];
		String month =a[1];
		String date =a[2];
		String year=a[5];

		String currentdate = day+" "+month+" "+date+" "+year;
		System.out.println(currentdate);


		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();

	//	driver.findElement(By.xpath("//div[@aria-label='"+currentdate+"']")).click();


	}

}
