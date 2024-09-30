package testPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	void search()
	{
		System.out.println("this is search");
	}

	@BeforeTest
	void login()
	{
		System.out.println("login to application...");
	}
	@AfterTest
	void logout()
	{
		System.out.println("logout from application....");
	}
}
