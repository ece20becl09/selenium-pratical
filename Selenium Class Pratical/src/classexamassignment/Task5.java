package classexamassignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Navigation nav = driver.navigate();
		driver.navigate().to("https://www.giallozafferano.it/");
		
		Thread.sleep(9000);
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(4000);
		nav.forward();
		Thread.sleep(5000);
		nav.refresh();
		
		Thread.sleep(7000);
		driver.quit();
		
	}

}
