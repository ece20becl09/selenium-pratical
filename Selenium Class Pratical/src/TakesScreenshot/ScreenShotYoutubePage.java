package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotYoutubePage {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://www.youtube.com/");
		TakesScreenshot temp=(TakesScreenshot) driver;
		File ts = temp.getScreenshotAs(OutputType.FILE);
		File src=new File("./assignmentshots/youtube.jpeg");
		FileHandler.copy(ts, src);
		
		driver.quit();
	}

}
