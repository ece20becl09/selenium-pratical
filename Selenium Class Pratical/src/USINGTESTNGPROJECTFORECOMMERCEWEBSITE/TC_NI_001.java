package USINGTESTNGPROJECTFORECOMMERCEWEBSITE;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_NI_001 extends BaseClass {
	@Test
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Navigated to Books Page Successfully", true);
	}

}
