package thread;

import org.testng.annotations.Test;

public class ClassOne extends BaseTest
{

	
	@Test
	public void test1() {
		System.out.println(getDriver().getTitle());
		System.out.println(Thread.currentThread().getId());
	}

}
