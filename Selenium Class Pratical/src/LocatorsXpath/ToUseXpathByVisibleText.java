package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// CLICK ON SHOPPING CART
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
