package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseOverAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");

		WebElement electronicselement = driver.findElement(By.xpath("//span[text()='Electronics']"));

		// To Use Actions Class
		Actions action = new Actions(driver);
		action.moveToElement(electronicselement).perform();
		action.pause(30).perform();
		
		//Thread.sleep(2000);

		driver.quit();

	}

}
