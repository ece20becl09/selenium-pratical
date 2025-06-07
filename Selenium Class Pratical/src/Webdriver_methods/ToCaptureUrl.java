package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// launch empty browser
		
		driver.get("https://www.flipkart.com/");// navigate to flipkart webpage
		
		String urlOfTheWebPage = driver.getCurrentUrl();// To capture of the webpage
		System.out.println(urlOfTheWebPage);
		driver.quit();
	}

}
