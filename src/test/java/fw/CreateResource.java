package fw;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sales.pctraders.generic.BaseClass;


@Listeners(com.sales.pctraders.generic.ListnersImplementation.class)
public class CreateResource extends BaseClass
{
	@Test
	public void createresourcewithmobile() {

		System.out.println("resource created");
		
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void createresourcewithemail() {

		//System.out.println("resource created with email");
		
		Assert.assertEquals(true, false);
	}
}
