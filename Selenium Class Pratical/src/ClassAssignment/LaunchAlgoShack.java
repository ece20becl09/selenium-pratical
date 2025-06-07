package ClassAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAlgoShack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://algoshack.com/");

		boolean isTextPresent = driver.getPageSource().contains("Algo A");
		Thread.sleep(2000);

		if (isTextPresent) {
			System.out.println("Text Is in the Webpage");

		} else {
			System.out.println("Text is not present in the webage");
		}
		driver.quit();
	}

}
