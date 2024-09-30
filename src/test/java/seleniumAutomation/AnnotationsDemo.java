package seleniumAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//  Before method And After Method
public class AnnotationsDemo {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout..");
		System.out.println("************************************");
	}
	
	@Test(priority=2) //if you don't give priority it will consider as 0 and will execute it first
	void advsearch()
	{
		System.out.println("This is advanced search...");
	}
	
	

}
