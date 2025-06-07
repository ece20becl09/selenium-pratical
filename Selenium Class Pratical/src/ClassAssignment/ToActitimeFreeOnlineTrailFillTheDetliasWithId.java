package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToActitimeFreeOnlineTrailFillTheDetliasWithId {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://www.actitime.com/free-online-trial");

		Thread.sleep(2000);
		// ENTER FIRSTNAME
		driver.findElement(By.id("FirstName")).sendKeys("Ashim");

		Thread.sleep(3000);
		// ENTER LASTNAME
		driver.findElement(By.id("LastName")).sendKeys("Mahapatro");

		Thread.sleep(4000);
		// ENTER EMAILADDRESS
		driver.findElement(By.id("Email")).sendKeys("chotu@gmail.com");

		Thread.sleep(5000);
		// ENTER COMPANY NAME
		driver.findElement(By.id("Company")).sendKeys("Q-Spider");

		Thread.sleep(6000);
		driver.quit();

	}

}
