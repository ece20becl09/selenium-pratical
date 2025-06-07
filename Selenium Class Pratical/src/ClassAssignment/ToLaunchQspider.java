package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchQspider {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://chat.qspiders.com/");
		Thread.sleep(2000);

		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("8763546774");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("ashim@123");

		Thread.sleep(6000);
		driver.findElement(By.tagName("Login")).click();

		Thread.sleep(7000);
		driver.findElement(By.id("_navbar_preview__e-Goz")).click();

		Thread.sleep(8000);
		driver.findElement(By.partialLinkText("Mock")).click();

		driver.quit();

	}

}
