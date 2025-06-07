package USINGTESTNGPROJECTFORECOMMERCEWEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_NI_003 extends BaseClass {
	@Test
	public void ToCheckElectronics() throws InterruptedException {
		WebElement electronicspage = driver.findElement(By.partialLinkText("Electronics"));
		electronicspage.click();
		Thread.sleep(3000);
		
		WebElement cellphones = driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']"));
		cellphones.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Smartphone']")).click();
		
		
		Thread.sleep(3000);
		WebElement smartphone = driver
				.findElement(By.xpath("//input[@id='add-to-cart-button-43']/../../../..//h1[contains(text(),'Smartphone')]"));

		smartphone.click();
		Reporter.log("Smartphone added into cart button", true);

	}

}
