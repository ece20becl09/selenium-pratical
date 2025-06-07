package webelement_and_its_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");

		// IDENTIFY USERNAME AND CLEAR THE USERNAME
		WebElement usernametextfield = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		usernametextfield.clear();
		Thread.sleep(2000);
		usernametextfield.sendKeys("chotu@gmail.com");

		// IDENTIFY PASSWORD AND CLEAR THE PASSWORD TEXTFIELD
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		Thread.sleep(3000);
		passwordtextfield.clear();
		Thread.sleep(3000);
		passwordtextfield.sendKeys("Chotu@123");
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.quit();

	}

}
