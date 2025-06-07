package AdvanceSeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnPriority {
	@Test(priority = -2, groups = "smoke", invocationCount = 3)
	public void cricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz is launched", false);
		driver.quit();

	}

	@Test(priority = -2, groups = "integration", invocationCount = 3)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
