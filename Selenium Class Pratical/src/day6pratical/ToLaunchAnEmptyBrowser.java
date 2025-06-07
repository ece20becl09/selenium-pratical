package day6pratical;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchAnEmptyBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
