package seleniumAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertvsSoftAssert {

	//@Test
	void test_HardAssertion()
	{
		System.out.println("testing...");
		System.out.println("testing..");
		
		//Assert.assertEquals(1, 1); //pass
		Assert.assertEquals(1, 2); //fail

		//After assertion fail then rest of statement will not execute
		System.out.println("testing..");
		System.out.println("Testing..");
	}
	
	@Test
	void Soft_Assertion()
	{
		System.out.println("testing...");
		System.out.println("testing..");
		
		SoftAssert sa= new SoftAssert();
		//sa.assertEquals(1, 1); //true
		sa.assertEquals(1, 2); //false


		// even After assertion fail till rest of statement will execute
		System.out.println("testing..");
		System.out.println("Testing..");
		
		sa.assertAll();  //manadatory step will show soft assertion got failed
	}
}
