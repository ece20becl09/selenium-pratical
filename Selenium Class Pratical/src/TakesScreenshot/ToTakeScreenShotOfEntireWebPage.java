package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotOfEntireWebPage {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		// To Take ScreenShot
		TakesScreenshot ts = (TakesScreenshot) driver; // we have to type casting from driver type to takescreenshot
														// type
		File temp = ts.getScreenshotAs(OutputType.FILE); // temporary it will store the file after program end it will
															// deleted
		File src = new File("./errorShots/Flipkart.img"); // permanent it will store the file
		FileHandler.copy(temp, src); // copy the file from temp to src

		driver.quit();

	}

}
