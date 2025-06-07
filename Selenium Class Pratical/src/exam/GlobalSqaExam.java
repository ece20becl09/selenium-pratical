package exam;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalSqaExam {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions srce = new ChromeOptions();
		srce.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(srce);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));

		WebElement trashframe = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		action.dragAndDrop(image1, trashframe).perform();
		action.dragAndDrop(image2, trashframe).perform();

		driver.switchTo().defaultContent();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement cheatsheetLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-item-6898")));
		cheatsheetLink.click();

//		WebElement addframe = driver.findElement(By.id("ad_iframe"));
//		driver.switchTo().frame(addframe);
//		driver.findElement(By.id("dismiss-button")).click();

		driver.findElement(By.linkText("SQL Cheat Sheet")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(parentwindow);
		for (String ids : allwindowid) {
			driver.switchTo().window(ids);
		}

		WebElement figureimage = driver.findElement(By.xpath(
				"//li[@class='wp-block-jetpack-slideshow_slide swiper-slide swiper-slide-active swiper-slide-duplicate-next swiper-slide-duplicate-prev']//img[@class='wp-block-jetpack-slideshow_image wp-image-6452 jetpack-lazy-image jetpack-lazy-image--handled']"));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", figureimage);
		// js.executeScript("window.scrollBy(0,1011)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", figureimage));

//		js.executeScript("window.scrollBy(0,990)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./assignmentshots/GlobalSq.jpeg");
		FileHandler.copy(temp, src);

		Thread.sleep(9000);
		driver.quit();

	}

}
