package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 
{

	@Test(dataProvider = "getdata")
	public void dataproviver(String s1,String s2,String s3) 
	{

		System.out.println(s1 +"_"+s2+"_"+s3);
	}

	@DataProvider
	public Object[][] getdata() 
	{

		Object arr[][] = new Object[3][3];

		arr [0][0]="Kirti";
		arr [0][1]="pravalika";
		arr[0][2]="123";


		arr[1][0]="rama";
		arr[1][1]="harika";
		arr[1][2]="456";

		arr[2][0]="shravani";
		arr[2][1]="xyz";
		arr[2][2]="789";
		return arr;


	}

}
