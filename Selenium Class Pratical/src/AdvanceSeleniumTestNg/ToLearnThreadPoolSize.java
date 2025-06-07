package AdvanceSeleniumTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnThreadPoolSize {
	@Test(invocationCount = 2, threadPoolSize = 1)
	public void Testgorilla() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.testgorilla.com/");
		Reporter.log("testgorilla website launch", true);
		driver.quit();
	}

	@Test(invocationCount = 3, threadPoolSize = 2)
	public void demowebshop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("demowebshop get executed", true);
		driver.quit();

	}

	@Test(invocationCount = 4, threadPoolSize = 4)
	public void demoqa() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/browser-windows");
		Reporter.log("demoqa get executed", true);
		driver.quit();
	}

}
