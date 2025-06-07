package Selfpraticse;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNgSelfPraticse {
	public WebDriver driver;
	public Alert al = (Alert) driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeClass 
	public void toLaunch() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demoqa.com/alerts");

	}

	@AfterClass 
	public void stopServer() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
