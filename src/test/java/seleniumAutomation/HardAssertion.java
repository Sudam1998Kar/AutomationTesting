package seleniumAutomation;

import org.testng.Assert;
import org.testng.annotations.*;

//Assert is class which has static method

public class HardAssertion {
	@Test
	void Test()
	{
		//Assert.assertEquals("xyz", "xyz");  //Passed
		//Assert.assertEquals("xyz", "xyz");  //Failed
		//Assert.assertEquals(124, 124);
		//Assert.assertEquals(123, "strif");
		
		//Assert.assertNotEquals(11,12);
		
		//Assert.assertTrue(true);   passed
		//Assert.assertTrue(false);  //fail
		//Assert.assertFalse(false);   //passe
		//Assert.assertFalse(true);      //fail
		
		//Assert.assertTrue(1==2); //fail
		//Assert.assertTrue(1==1);  //passed
		
		//Assert.assertFalse(1==2); //pass
		//Assert.assertFalse(1==1); //fail
		
		Assert.fail();
		

	}

}
