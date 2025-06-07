package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTittle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//launch browser
		driver.get("https://www.flipkart.com/");//navigate to flipkart

		// To capture the title of the webpage
		String titleofwebpage = driver.getTitle();
		System.out.println(titleofwebpage);
		driver.quit();
	}

}
