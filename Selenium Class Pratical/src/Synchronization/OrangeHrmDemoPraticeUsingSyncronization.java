package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemoPraticeUsingSyncronization {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// THREAD.SLEEP():-Advantage:-Easy to use
		// Disadvantage:-1)if the time is not sufficient then you will get exception
		// 2)it will wait for maximum time out.this will reduce the performance script.
		// 3)multiple times

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.quit();
	}

}
