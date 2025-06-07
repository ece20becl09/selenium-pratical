package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.oracle.com/in/java/technologies/downloads/");

		driver.findElement(By.linkText("jdk-17.0.15_linux-aarch64_bin.tar.gz")).click();

		WebElement disabledelement = driver.findElement(By.linkText("Download jdk-17.0.15_linux-aarch64_bin.tar.gz"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", disabledelement);

		Thread.sleep(5000);
		driver.quit();

	}

}
