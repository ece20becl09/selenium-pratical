package webelement_and_its_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSizeOfTheWebElement {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/");

		Dimension SizeOfTheLoginButton = driver.findElement(By.linkText("Log in")).getSize();
		System.out.println(SizeOfTheLoginButton);
		System.out.println(SizeOfTheLoginButton.getHeight());
		System.out.println(SizeOfTheLoginButton.getWidth());
		
		driver.quit();
	}

}
