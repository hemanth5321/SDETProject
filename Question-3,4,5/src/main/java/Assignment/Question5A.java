package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question5A {

	static WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	}

	@Test
	public void isLogoPresent() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		Assert.assertNotEquals(element, null);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
