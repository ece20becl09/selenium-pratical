package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		// EnterUserName
		driver.findElement(By.id("email")).sendKeys("chotu@gmail.com");
		Thread.sleep(3000);

		// EnterPassword
		driver.findElement(By.id("pass")).sendKeys("Chotu@123");
		Thread.sleep(4000);

		Thread.sleep(6000);
		driver.quit();

	}

}
