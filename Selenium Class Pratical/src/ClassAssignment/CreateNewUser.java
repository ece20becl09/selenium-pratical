package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewUser {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// LAUNCH WEB-BROWSER
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");

		// CLICK ACTION ON REGISTER BUTTON
		Thread.sleep(2500);
		driver.findElement(By.linkText("Register")).click();

		// AFTER CLICK ON REGISTER CLICK MAIL OPTION
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();

		// FILAF FIRST NAME
		Thread.sleep(3200);
		driver.findElement(By.id("FirstName")).sendKeys("chotu");

		// FILAF LAST NAME
		Thread.sleep(3800);
		driver.findElement(By.id("LastName")).sendKeys("panda");

		// FILAF EMAIL-ADDRESS
		Thread.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys("bapapa@gmail.com");

		// FILAF PASSWORD
		Thread.sleep(4200);
		driver.findElement(By.id("Password")).sendKeys("Bapapanda@123");

		// FILAF CONFIRM PASSWORD
		Thread.sleep(4500);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Bapapanda@123");

		// CLICK ON REGISTER BUTTON
		Thread.sleep(5000);
		driver.findElement(By.id("register-button")).click();

		// NAVIGATE TO COMPUTERS PAGE AFTER REGISTRATION
		Thread.sleep(5500);
		driver.findElement(By.partialLinkText("Computers")).click();

		// NAVIGATE TO BOOKS PAGE AFTER REGISTRATION
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Books")).click();

		// NAVIGATE TO ELECTRONICS PAGE AFTER REGISTRATION
		Thread.sleep(5100);
		driver.findElement(By.partialLinkText("Electronics")).click();

		// NAVIGATE TO APPARELSHOES PAGE
		Thread.sleep(5250);
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();

		// NAVIGATE TO DIGITAL DOWNLOADS PAGE
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("Digital downloads")).click();

		// NAVIGATE TO JEWELERY PAGE
		Thread.sleep(6200);
		driver.findElement(By.partialLinkText("Jewelry")).click();

		// NAVIGATE TO GIFT CARDS PAGE
		Thread.sleep(6500);
		driver.findElement(By.partialLinkText("Gift Cards")).click();

		// SEARCH THE PRODUCT IN SEARCH BAR AND CLICK ON SEARCH BUTTON
		Thread.sleep(6600);
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");

		// CLICK ON SEARCH BUTTON
		Thread.sleep(9000);
		driver.findElement(By.className("button-1")).click();

		Thread.sleep(7000);
		driver.quit();

	}

}
