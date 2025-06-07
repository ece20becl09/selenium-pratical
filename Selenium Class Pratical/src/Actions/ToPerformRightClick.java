package Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.google.com/webhp?authuser=1");

		Actions action = new Actions(driver);
		action.contextClick().perform();

		driver.quit();

	}

}
