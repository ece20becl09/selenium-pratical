package ClassAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenWoodernStreetAndClickOnAny3productAndAddToTheCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		// settings.addArguments("--headless=new"); //it will not show the ui
		// application running process

		// How to remove "Chrome is being controlled by automated test software"
		// settings.setExperimentalOption("excludeSWITCHES", new String[]
		// {"enable-automation"});

		WebDriver driver = new ChromeDriver(settings);
		Navigation nav = driver.navigate();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.woodenstreet.com/");

		driver.findElement(By.xpath("//img[@alt='modal-close-img']")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Sofas")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Fabric Sofas")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@title='Henry 3 Seater Sofa (Velvet, Chestnut Brown)']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//img[@alt='Image 1']/../../../../../../../../../..//div[@class='style_shopBtn__cdbEB']//button[@id='button-cart-buy-now']"))
				.click();

		Thread.sleep(3000);

		nav.back();
		nav.refresh();

		driver.findElement(By.linkText("Living")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("TV Units")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Sahira Engineered Wood Floor Rested Tv Unit (Columbian Walnut Finish)"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//img[@alt='Image 1']/../../../../../../../../../..//div[@class='style_shopBtn__cdbEB']//button[@id='button-cart-buy-now']"))
				.click();

		Thread.sleep(3000);

		nav.back();
		nav.refresh();

		driver.findElement(By.linkText("Bedroom")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("King Size Beds")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Clemency Bed with Box Storage (King Size, Columbian Walnut Finish)")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//div[@class='style_product-main-slider__OupI3']//img[@alt='Image 1']/../../../../../../../../../..//div[@class='style_shopBtn__cdbEB']//button[@id='button-cart-buy-now']"))
				.click();

		Thread.sleep(4000);
		driver.quit();

	}

}
