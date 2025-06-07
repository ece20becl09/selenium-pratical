package Webdriver_methods;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Thread.sleep(3000);

		// ALTERNATE WAY NAVIGATE TO WEB BROWSER
		//driver.navigate().to("https://www.zomato.com/");

		// ANOTHER WAY NAVIGATE TO WEB BROSWER
		// driver.navigate().to(new URL("https://www.zomato.com/"));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);

		// NAVIGATE
		Navigation nav = driver.navigate();

		nav.back();
		Thread.sleep(3000);

		nav.forward();
		Thread.sleep(9000);

		nav.refresh();
		Thread.sleep(5000);

		Thread.sleep(6000);
		driver.quit();

	}

}
