package ClassAssignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LaunchYoutubeAndPlayFavouriteSong {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// LAUNCH YOUTUBE
		driver.get("https://www.youtube.com/");

		// FIND SOME SONG IN SEARCH BUTTON
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("JAGATARE PAIBUNI EMITI THAKURA TIE");

		// CLICK ON SEARCH BUTTON
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();

		// CLICK ON VIDEO
		Thread.sleep(9000);
		driver.findElement(By.xpath(
				"//yt-formatted-string[contains(text(),'JAGATARE PAIBUNI EMITI THAKURA TIE // ଜଗତରେ ପାଇବୁନି ଏମିତି ଠାକୁର ଟିଏ // Viral Jagannath Bhajan 2023')]"))
				.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File per = new File("./assignmentshots/youtubefull1.jpeg");
		FileHandler.copy(temp, per);
		
		Thread.sleep(90000);
		driver.quit();
	}
}
