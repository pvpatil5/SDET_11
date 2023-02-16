package thread;

import org.testng.annotations.Test;

public class ClassTwo extends BaseTest
{

	
	@Test
	public void test2() 
	{
		System.out.println(getDriver().getCurrentUrl());
		System.out.println(Thread.currentThread().getId());
	}

}
