package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGetMethod {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launch empty browser//start server
		driver.get("https://www.flipkart.com/"); // navigate to flipkart
		driver.get("https://demo.nopcommerce.com/"); // navigate to demonopcommerce
	}

}
