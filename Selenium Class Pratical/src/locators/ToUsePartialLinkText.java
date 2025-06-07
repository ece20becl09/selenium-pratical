package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsePartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/login");

		Thread.sleep(7000);
		driver.findElement(By.partialLinkText("Books")).click();
		
		driver.quit();
	}

}
