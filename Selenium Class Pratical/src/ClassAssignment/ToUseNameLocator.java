package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//Enter user name
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("chotu@123");
		
		//ENTER PASSWORD
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("demo@123");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
