package exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateThroughManageMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Navigation nav = driver.navigate();
		//nav.to("https://demowebshop.tricentis.com/");
		nav.to("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
		 WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Log in")));
		
		Actions action = new Actions(driver);
		action.contextClick(loginbutton);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
