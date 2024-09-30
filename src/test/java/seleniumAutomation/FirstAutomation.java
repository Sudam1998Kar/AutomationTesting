package seleniumAutomation;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.By;

public class FirstAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// Launch website
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();

		// Click on the search text box and send value
		driver.findElement(By.className("gLFyf")).sendKeys("javatpoint tutorials");

		// Click on the search button
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		Thread.sleep(2000);
        //driver.close();
		driver.findElement(By.xpath("//h3[text()='javatpoint: Tutorials List']")).click();
	}

}

