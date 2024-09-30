package seleniumAutomation;

import org.testng.annotations.Test;
// for TestNg do not create main method u won't get TestNg run option 
//@Test option is necessary to execute test
public class Day1 {
   
	@Test(priority=1)
	void openapp()
	{
		System.out.println("opening application....");
	}
	
    @Test(priority=2)
	void login()
	{
		System.out.println("Login to application...");
	}
	
	@Test(priority=3)
	void logout()
	
	{
		System.out.println("logout from application...");
	}
}
