package testPack;

import org.testng.annotations.*;

public class C3 {
	@Test
	void pqr()
	{
		System.out.println("This is from c3");
	}
	
	@BeforeSuite
	void bc()
	{
		System.out.println("this is before suit...");
	}
	
	@AfterSuite
	void ac()
	{
		System.out.println("this is after suit....");
	}

}
