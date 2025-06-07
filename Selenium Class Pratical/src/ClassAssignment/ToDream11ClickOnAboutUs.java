package ClassAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDream11ClickOnAboutUs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");

		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(2000);

		String parentid = driver.getWindowHandle();
		System.out.println("parentid:-" + parentid);

		Set<String> allids = driver.getWindowHandles();
		System.out.println("Windows id" + allids);
		allids.remove(parentid);

		for (String id : allids) {
			driver.switchTo().window(id);
		}

		// Wait for "Dream Responsibly" link to be clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dream Responsibly")));

		driver.findElement(By.linkText("Dream Responsibly")).click();

		Thread.sleep(2000);
		driver.quit();

	}

}
