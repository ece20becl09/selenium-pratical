package Selfpraticse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationAndSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/computers");
		WebElement electronics = driver.findElement(By.partialLinkText("Electronics"));

		Dimension siz = electronics.getSize();
		System.out.println(siz.getHeight());
		System.out.println(siz.getWidth());

		Point loc = electronics.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		WebElement title = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		String colo = title.getCssValue("color");
		System.out.println(colo);

		String tag = title.getTagName();
		System.out.println(tag);

		WebElement regi = driver.findElement(By.partialLinkText("Register"));
		String co = regi.getCssValue("color");
		System.out.println(co);

		driver.quit();

	}

}
