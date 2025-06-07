package Webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAllIds {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");  //here we have to pass the link 
		Thread.sleep(2000);
		
		//CLICK ON OPEN FOOD SITES
		driver.findElement(By.id("men")).click();  //here we have to pass the id link
		Thread.sleep(3000);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		driver.quit();
	}

}
