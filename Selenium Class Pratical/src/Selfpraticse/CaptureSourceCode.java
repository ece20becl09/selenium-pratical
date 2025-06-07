package Selfpraticse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSourceCode {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://github.com/dashboard");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
	}

}
