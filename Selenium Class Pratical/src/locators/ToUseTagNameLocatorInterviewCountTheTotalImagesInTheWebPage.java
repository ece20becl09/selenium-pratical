package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTagNameLocatorInterviewCountTheTotalImagesInTheWebPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		// COUNT TOTAL NUMBER OF IMAGES PRESENT IN THE WEBPAGE

		// NAVIGATE TO FLIPKART OR AMAZON COUNT THE TOTAL NUMBERS LINK PRESENT IN THE
		// WEBPAGE INTERVIEW QUESTION
		List<WebElement> images = driver.findElements(By.tagName("img"));
		Thread.sleep(4000);
		System.out.println(images.size());

		driver.quit();
	}

}
