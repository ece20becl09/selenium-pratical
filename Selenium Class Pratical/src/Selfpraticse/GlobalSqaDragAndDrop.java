package Selfpraticse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class GlobalSqaDragAndDrop {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		WebElement image1 = driver.findElement(By.xpath("//img [@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img [@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img [@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img [@alt='On top of Kozi kopka']"));

		// identify trash
		WebElement trash = driver.findElement(By.id("trash"));

		// Create and object of action class
		Actions action = new Actions(driver);

		Thread.sleep(2000);
		action.dragAndDrop(image1, trash).perform();

		Thread.sleep(3000);
		action.dragAndDropBy(image2, 500, 0).moveToElement(trash).perform();

		Thread.sleep(3000);
		action.clickAndHold(image3).moveToElement(trash).perform();

		Thread.sleep(3000);
		action.clickAndHold(image4).moveByOffset(500, 0).release().perform();

		Thread.sleep(9000);
		
		TakesScreenshot tS = (TakesScreenshot) driver;
		File temp = tS.getScreenshotAs(OutputType.FILE);
		File org = new File("./assignmentshots/error5.png");
		FileHandler.copy(temp, org);
		
		Thread.sleep(9000);

		// drag and drop from trash to gallery
		WebElement gallery = driver.findElement(By.id("gallery"));

		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);

		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(3000);

		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(3000);

		action.clickAndHold(image4).moveToElement(gallery).release().perform();
		Thread.sleep(3000);
		
		Thread.sleep(6000);
		TakesScreenshot tS1 = (TakesScreenshot) driver;
		File temp1 = tS1.getScreenshotAs(OutputType.FILE);
		File org1 = new File("./assignmentshots/error4.png");
		FileHandler.copy(temp1, org1);


		Thread.sleep(3000);

		driver.quit();

	}

}
