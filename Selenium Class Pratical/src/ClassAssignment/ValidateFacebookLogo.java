package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateFacebookLogo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		boolean facebooklogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();

		// for validation
		if (facebooklogo == true) {
			System.out.println("Facebook Logo Displaying");

		}else {
			System.out.println("Facebokk Logo Not Displaying");
		}

		driver.quit();
	}

}
