package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://licindia.in/");

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.xpath("//a[@title='Login']")).click();

		// To Handle confirmation popup
		Alert confirmationpopup = driver.switchTo().alert();
		System.out.println(confirmationpopup.getText());
		confirmationpopup.dismiss();
		
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File src = screenshot.getScreenshotAs(OutputType.FILE);
//		File temp = new File("./addignment/error.png");
//		FileHandler.copy(src, temp);
		
//		File s = driver.findElement(By.id("eg")).getScreenshotAs(OutputType.FILE);
//		File des = new File("./assignment/error.png");
//		FileHandler.copy(s, des);
//		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
