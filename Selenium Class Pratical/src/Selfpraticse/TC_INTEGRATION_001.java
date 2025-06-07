package Selfpraticse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_INTEGRATION_001 extends TestNgSelfPraticse {
	@Test
	public void StartWork() {
		driver.findElement(By.id("alertButton")).click();
		al.accept();
		WebElement timeralert = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton")));
		timeralert.click();

	}

}
