package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathContainsUsingVisibleText {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// CLICK ON LOGIN LINK
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);

		// CLICK ON LOGIN BUTTON
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);

		// CAPTURE THE ERROR MESSAGE
		String errormessage = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(errormessage);
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.quit();

	}

}
