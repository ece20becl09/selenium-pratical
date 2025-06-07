package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToPerformClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("Ashim@1234");

		WebElement eyebutton = driver.findElement(By.xpath("//div[@tabindex='0']"));

		Actions action = new Actions(driver);
		action.clickAndHold(eyebutton).perform();

		// To Release the click and hold
		Thread.sleep(5000);
		action.release(eyebutton).perform();
		
		driver.quit();

	}
}
