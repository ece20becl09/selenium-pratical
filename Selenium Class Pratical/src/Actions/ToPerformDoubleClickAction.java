package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement clicktheelement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions acti = new Actions(driver);
		acti.doubleClick(clicktheelement).perform();

		Thread.sleep(3000);
		driver.quit();
	}

}
