package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.className("-dOa_b L_FVxe")).click();:-compound class names not permitted
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.className("email")).sendKeys("Demo@123");
		
		driver.quit();
	}

}
