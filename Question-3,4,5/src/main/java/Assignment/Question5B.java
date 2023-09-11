package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question5B {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com/");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void search() throws InterruptedException {
		
		//click on flights
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[2]")).click();
		Thread.sleep(3000);
		
		//click on one way
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[1]")).click();
		
		//enter from location
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).click();
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Pune");
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		Thread.sleep(3000);
		
		//enter to location
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/label/span")).click();
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("Visakhapatnam");
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		Thread.sleep(3000);
	
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

