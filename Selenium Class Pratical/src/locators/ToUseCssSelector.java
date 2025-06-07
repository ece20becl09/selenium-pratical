package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelector {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']"));
		element.sendKeys("TV");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);

		driver.quit();

	}

}
