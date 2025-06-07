package ClassAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToWoodenStreetWebPageAndCloseThePopUpAndLessUsingThreadSleepMoreThen3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");

		for (;;) {
			try {
				driver.findElement(By.xpath("//img[@alt='modal-close-img']")).click();
				break;
			} catch (Exception e) {
				Thread.sleep(3000);

			}
		}

		// To capture Multiple Elements And Print Through Using For each loop
		List<WebElement> listsofallelement = driver
				.findElements(By.xpath("//ul[@class='style_headerMenu__YKf8q ']/li"));// lists of webelement present in
																						// the woodenstreet webpage and
																						// print in the console window
																						// and first find the common
																						// parents,write xpath,traverse
																						// to child xpath for common
																						// parent/traverse through all
																						// child
		for (WebElement web : listsofallelement) {
			System.out.println(web.getText());
		}
		driver.quit();

	}
}
