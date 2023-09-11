package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement element = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		if(element != null) {
			System.out.println("Logo is Present");
		}else {
			System.out.println("Logo is Not Present");
		}
		driver.quit();

	}
}
