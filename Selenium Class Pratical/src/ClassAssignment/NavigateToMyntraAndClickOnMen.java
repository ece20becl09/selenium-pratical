package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMyntraAndClickOnMen {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.className("desktop-main")).click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
