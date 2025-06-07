package pomRepos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		WebElement emailtextfield = driver.findElement(By.id("email"));
		
		driver.navigate().refresh();
		emailtextfield.sendKeys("ashimmahapatro2001@gmail.com");
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
