package ClassAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadTheAutomationToolUsingAutomationScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.selenium.dev/");
		driver.findElement(By.linkText("Downloads")).click();

		// Create JavascriptExecutor object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Wait for page to load
		Thread.sleep(2000);

		// Locate and click "previous releases" link using JS
		WebElement releaseLink = driver.findElement(By.xpath("//a[contains(text(),'releases')]"));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", releaseLink);
		js.executeScript("arguments[0].click();", releaseLink);

		WebElement selenimversion = driver.findElement(By.xpath("//span[text()='Selenium 4.20.0']"));
		selenimversion.click();

		Thread.sleep(2000);
		WebElement seleniumjarfile = driver.findElement(By.xpath("//a[text()='selenium-server-4.20.0.jar']"));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", seleniumjarfile);
		driver.findElement(By.xpath("//a[text()='selenium-server-4.20.0.jar']")).click();

		Thread.sleep(2000);
		driver.quit();
	}
}
