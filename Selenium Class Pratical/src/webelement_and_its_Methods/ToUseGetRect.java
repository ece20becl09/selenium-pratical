package webelement_and_its_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // UPCASTING//CROSS BROWSER TESTING
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		Rectangle rect = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getRect();
		System.out.println(rect);
		System.out.println("Width of the web Element: " + rect.getWidth());
		System.out.println("Height Of the Web Element: " + rect.getHeight());
		System.out.println("X cordinates of the web element: " + rect.getX());
		System.out.println("Y Cordinates of the web element: " + rect.getY());

		Thread.sleep(2000);
		driver.quit();

	}

}
