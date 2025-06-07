package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoWebShopWithoutSendKeysPassTheAllValues {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/register");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement genderoption = driver.findElement(By.id("gender-male"));
		jse.executeScript("arguments[0].click()", genderoption);

		WebElement firstname = driver.findElement(By.id("FirstName"));
		jse.executeScript("arguments[0].value='chotu'", firstname);

		WebElement lastname = driver.findElement(By.id("LastName"));
		jse.executeScript("arguments[0].value='panda'", lastname);

		WebElement email = driver.findElement(By.id("Email"));
		jse.executeScript("arguments[0].value='chotupanda@gmail.com'", email);

		WebElement pass = driver.findElement(By.id("Password"));
		jse.executeScript("arguments[0].value='chotu@123'", pass);

		WebElement confirmpass = driver.findElement(By.id("ConfirmPassword"));
		jse.executeScript("arguments[0].value='chotu@123'", confirmpass);

		WebElement registerbutton = driver.findElement(By.id("register-button"));
		jse.executeScript("arguments[0].click()", registerbutton);

		Thread.sleep(6000);
		driver.quit();

	}

}
