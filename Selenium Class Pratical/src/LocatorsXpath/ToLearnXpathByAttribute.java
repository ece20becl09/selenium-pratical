package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);

		driver.quit();
		Thread.sleep(3000);

	}

}
