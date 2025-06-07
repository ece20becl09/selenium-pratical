package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnMultipleAttributeInXpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		// CLICK ON LOGIN
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);

		// CLICK ON SEARCH
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='submit'and@value='Search']")).click();

		Thread.sleep(9000);
		driver.quit();
	}

}
