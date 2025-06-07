package USINGTESTNGPROJECTFORECOMMERCEWEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_NI_002 extends BaseClass {
	@Test
	public void ToCheckComputerWebPage() throws InterruptedException {
		WebElement computerpage = driver.findElement(By.partialLinkText("Computers"));
		computerpage.click();
		Thread.sleep(3000);
		
		WebElement cheapcomputer = driver.findElement(By.xpath(
				"//input[@value='Add to cart']/../../../..//img[@alt='Picture of Build your own cheap computer']"));
		cheapcomputer.click();
		
		Reporter.log("Cheap computer is successfully added to cart button", true);
	}

}
