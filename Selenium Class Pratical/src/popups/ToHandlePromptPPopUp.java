package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlePromptPPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		driver.switchTo().frame("iframeResult");

		WebElement trybutton = driver.findElement(By.xpath("//button[text()='Try it']"));
		trybutton.click();

		Alert ref = driver.switchTo().alert();
		ref.sendKeys("Ashim");
		Thread.sleep(2000);
		ref.accept();
		
		Actions s = new Actions(driver);
		s.doubleClick();
		s.doubleClick(trybutton);
		driver.switchTo().parentFrame();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//button[text()='Try it']"), true));

		Thread.sleep(2000);

		driver.quit();

	}

}
