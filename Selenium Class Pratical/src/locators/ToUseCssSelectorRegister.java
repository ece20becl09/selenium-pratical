package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelectorRegister {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[data-val-required='First name is required.']")).sendKeys("Ashim");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("Mahapatro");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("demo3787@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("resume@123");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("resume@123");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
