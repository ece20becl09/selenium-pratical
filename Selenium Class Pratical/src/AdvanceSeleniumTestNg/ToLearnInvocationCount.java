package AdvanceSeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnInvocationCount {
	@Test(priority = -1, invocationCount = 5, threadPoolSize = 3 ,groups = "globalization" )
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon get executed ", true);
		driver.quit();
	}

	@Test(priority = -2, invocationCount = 3, groups = "system")
	public void flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

}
