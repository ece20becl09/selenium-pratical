package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleCalenderPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");

		// close ads
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		// To Click On departure
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='November 2025']/../..//p[text()='14']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}

		}

		Thread.sleep(4000);
		driver.quit();

	}

}
