package ClassAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetParasiteForecasts {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//JavascriptExecutor jse = (JavascriptExecutor) driver;

		driver.get("https://petdiseasealerts.org/forecast-map/#/giardia/dog/united-states/colorado/305-teller-county");
		// WebElement map = driver.findElement(By.id("features"));

		// switch to frame
		driver.switchTo().frame(0);

		// jse.executeScript("arguments[0].scrollIntoView(true));",map);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.name("Colorado")).click();

		driver.switchTo().parentFrame();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Sign up']")).click();

		driver.findElement(By.id("user")).sendKeys("nipox93782@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Chto@123");
		driver.findElement(By.id("cpass")).sendKeys("Chto@123");
		driver.findElement(By.id("firstName")).sendKeys("Chot");
		driver.findElement(By.id("lastName")).sendKeys("Pand");
		driver.findElement(By.id("phone")).sendKeys("0000123149");

		WebElement useroption = driver.findElement(By.id("user-type"));
		Select dropdown = new Select(useroption);
		dropdown.selectByValue("5");

		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("accept-tou"));
		checkbox.click();

		action.sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signup.click();

		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement successmessage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Thank you for registering!']")));

		System.out.println("Signup Confiramtion: " + successmessage.getText());

		Thread.sleep(2000);
		TakesScreenshot tse = (TakesScreenshot) driver;
		File temp = tse.getScreenshotAs(OutputType.FILE);
		File per = new File("./assignmentshots/confiramtion.jepg");
		FileHandler.copy(temp, per);

		Thread.sleep(4000);
		driver.quit();
	}

}
