package TakeScreenShotAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZomatoParticularZomatoWebElementScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		File temp = driver.findElement(By.xpath("//img[@loading='eager' and @class='h-8 w-auto lg:h-8 xl:h-10 2xl:h-14']"))
				.getScreenshotAs(OutputType.FILE);
		File orginal = new File("./assignmentshots/element1.jpeg");
		FileHandler.copy(temp, orginal);

		driver.quit();
	}

}
