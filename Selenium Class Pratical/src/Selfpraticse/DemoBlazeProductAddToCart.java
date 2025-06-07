package Selfpraticse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeProductAddToCart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.demoblaze.com/");

		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']/..//a[@onclick='addToCart(1)']")).click();
	

		Thread.sleep(2000);
		driver.quit();
	}

}
