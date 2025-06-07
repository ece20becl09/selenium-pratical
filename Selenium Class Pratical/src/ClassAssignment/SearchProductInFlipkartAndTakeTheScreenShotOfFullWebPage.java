package ClassAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductInFlipkartAndTakeTheScreenShotOfFullWebPage {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.flipkart.com/");

		// Search for product
		driver.findElement(By.name("q")).sendKeys("iPhone", Keys.ENTER);

		// Wait until product is clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[contains(text(),'iPhone 13 (Midnight, 128 GB)')]")));

		// Take screenshot of parent page
		TakesScreenshot scr = (TakesScreenshot) driver;
		File parentShot = scr.getScreenshotAs(OutputType.FILE);
		File child = new File("./assignmentshots/parentwebpagescreenshot.jpeg");
		FileHandler.copy(parentShot, child);

		String parentId = driver.getWindowHandle();

		// Click product this opens new window/tab
		driver.findElement(By.xpath("//div[contains(text(),'iPhone 13 (Midnight, 128 GB)')]")).click();

		Thread.sleep(3000);

		// Get all window handles and switch to child
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowId : allWindows) {
			if (!windowId.equals(parentId)) {
				driver.switchTo().window(windowId);
				break;
			}
		}

		Thread.sleep(3000);

		// Take screenshot of child window
		File childShot = scr.getScreenshotAs(OutputType.FILE);
		File suchildshot = new File("./assignmentshots/childwindowscreenshot.jpeg");
		FileHandler.copy(childShot, suchildshot);

		// Taking the ScreenShot Paricular Image Of The Selected Iphone
		Thread.sleep(3000);
		File temp = driver.findElement(By.xpath("//img[contains(@class,'DByuf4 IZexXJ jLEJ7H')]"))
				.getScreenshotAs(OutputType.FILE);
		File orgFile = new File("./assignmentshots/iphone.jpg");
		FileHandler.copy(temp, orgFile);

		driver.quit();
	}
}
