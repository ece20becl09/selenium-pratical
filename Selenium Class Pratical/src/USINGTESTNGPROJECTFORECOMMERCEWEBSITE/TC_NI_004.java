package USINGTESTNGPROJECTFORECOMMERCEWEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_NI_004 extends BaseClass {
	@Test
	public void ToCheckApparel() throws InterruptedException {
		WebElement shoespage = driver.findElement(By.partialLinkText("Apparel & Shoes"));
        shoespage.click();
        Thread.sleep(3000);
        
		WebElement sneaker = driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']"));
		sneaker.click();
		Thread.sleep(3000);

		WebElement sneakers = driver.findElement(
				By.xpath("//input[@id='add-to-cart-button-28']/../../../..//h1[contains(text(),'Blue and green')]"));
		sneakers.click();
		
		Reporter.log("Successfully product added to the cart", true);

	}

}
