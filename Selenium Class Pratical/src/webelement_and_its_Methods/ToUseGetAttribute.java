package webelement_and_its_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/");

		String value = driver.findElement(By.linkText("Try actiTIME for Free")).getAttribute("class");
		Thread.sleep(3000);
		System.out.println(value);

		driver.quit();
	}

}
