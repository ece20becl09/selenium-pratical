package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// LAUNCH EMPTY BROWSER
		driver.get("https://www.zomato.com/");// NAVIGATE TO ZOMATO WEBPAGE

		// CAPTURE THE PAGE SOURCE CODE
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		driver.quit();
	}

}
