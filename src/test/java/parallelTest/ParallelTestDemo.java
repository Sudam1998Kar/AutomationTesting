package parallelTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo {
	WebDriver driver;
	
	@Test(priority=2)
	void test1() throws InterruptedException
	{
		System.out.println("this is test1");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.close();
	}
	
	@Test(priority=3)
	void test2() throws InterruptedException
	{
		System.out.println("this is test2");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
        Thread.sleep(2000);
		//driver.close();
		//driver.quit();
	}
	
	@Test(priority=1)
	void test3() throws InterruptedException
	
	{  
		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("this is test3");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	void test4() throws InterruptedException
	{
		driver=new ChromeDriver();

		System.out.println("this is test4");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
	}
	

}
