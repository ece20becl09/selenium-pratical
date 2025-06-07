package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); // LAUNCH EMPTY BROWSER
		driver.get("https://www.zomato.com/"); // NAVIGATE TO ZOMATO WEBPAGE

		Thread.sleep(3000); // PAUSE FOR 3 SECONDS
		driver.close();

	}

}
