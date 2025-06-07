package webelement_and_its_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetCssValue {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);

		WebElement tryFreeEle = driver.findElement(By.linkText("Try actiTIME for Free"));

		System.out.println(tryFreeEle.getCssValue("border-radius"));
		System.out.println(tryFreeEle.getCssValue("font-size"));
		System.out.println(tryFreeEle.getCssValue("background-color"));
		System.out.println(tryFreeEle.getCssValue("font-family"));

		Thread.sleep(3000);
		driver.quit();
	}

}
