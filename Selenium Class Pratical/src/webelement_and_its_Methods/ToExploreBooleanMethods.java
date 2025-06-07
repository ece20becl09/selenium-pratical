package webelement_and_its_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreBooleanMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement radiobutton = driver.findElement(By.id("pollanswers-1"));
		System.out.println("---BEFORE SELECTING---");
		System.out.println(radiobutton.isSelected());
		System.out.println("---AFTER SELECTING---");
		Thread.sleep(2000);
		radiobutton.click();
		System.out.println(radiobutton.isSelected());

		driver.quit();

	}

}
