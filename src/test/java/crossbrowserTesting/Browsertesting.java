package crossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsertesting {
	
	WebDriver driver;
	ChromeOptions chromeoptions=new ChromeOptions();
	EdgeOptions   edgeoptions=new EdgeOptions();
	FirefoxOptions firefoxoptions=new FirefoxOptions();
	
	@Parameters("Browser")
	@BeforeTest
	void test(String Browser)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("Chrome opened successfully");
			}
		
		else if(Browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println("Edge opened successfully");
		}
		
		/*else if(Browser.equals("firefox"))            //will not execute as there is no firefox app in windows
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("Firefox opened successfully");
		}
		*/
	}
	
	@Test
	void OrangeHrmlogin()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String Act=driver.getTitle();
		String Exp="OrangeHRM";
		
		Assert.assertEquals(Act, Exp);
	/*	if(Act.equals(Exp))
		{
			System.out.println("Tilte matched");
		}
		
		else
		{
			System.out.println("not matched");
		}
		*/
		
	
	}
	@AfterTest
	void logout()
	{
		driver.quit();
	}

}
