package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://indiapostgdsonline.gov.in/");

		// CAPTURE THE SESSION ID
		String ParentId = driver.getWindowHandle(); // 1st time id:-96DD1A16964FC516C09C5DD01D36C6A1

		System.out.println(ParentId); // 2nd time id:-E3352E3592AB643A22F705A99AB4411E

		driver.quit();
	}

}
