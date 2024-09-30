package seleniumAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * 1> login.....BeforeClass
 * search
 * Advsearch
 * logout........AfterClass
 */
public class AnnotationsDemo2 {
	@BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search...");
	}
	
	@AfterClass
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
