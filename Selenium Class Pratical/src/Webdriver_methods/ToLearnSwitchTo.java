package Webdriver_methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		// * IMPORTANT *

		// how to capture the parent id and child id and switch the window properties
		// from parent to child window

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");

		driver.manage().window().maximize();

		// capture parent id
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click action on open shopperstack
		driver.findElement(By.id("men")).click();
		

		// TO CAPTURE ALL WINDOW IDS
		Set<String> allids = driver.getWindowHandles();
		allids.remove(parentId);

		// FOR EACH
		for (String id : allids) {
			driver.switchTo().window(id);
			driver.close();
			Thread.sleep(3000);
		}

	}
}
