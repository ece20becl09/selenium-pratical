package AdvanceSeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {

	@Test(dependsOnMethods = { "demowebshop", "flipkart" }, threadPoolSize = 2, invocationCount = 2)
	public void Testgorilla() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.testgorilla.com/");
		Reporter.log("testgorilla website launch", true);
		driver.quit();
	}

	@Test(threadPoolSize = 1, invocationCount = 1, enabled = true)
	public void demowebshop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("demowebshop get executed", true);
		driver.quit();

	}

	@Test
	public void flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
}
