package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDeclareExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://shoppersstack.com/products_page/18");
		driver.findElement(By.id("Check Delivery")).sendKeys("560037");

		// EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

		driver.findElement(By.id("Check")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}
	
}
