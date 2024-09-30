package seleniumAutomation;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertonDemo {
	
	@Test
	void TestTitle()            //we have to use assertion to make this this method fail or pass
	{
		String exp_title="Opencart";
		String Act_title="Opencart";
		
		/*if (exp_title.equals(Act_title)) 
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		
		else
		{
			System.out.println("Test failed");
			Assert.assertTrue(false);           // now the testTile will fail
		}   */
		
		Assert.assertEquals(Act_title,exp_title);
	}

}
