package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopUsingDataTesting {

	    public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("./TestData/demowebshopregister.properties");
		Properties file1 = new Properties();

		file1.load(file);
		String url = file1.getProperty("url");
		String firstname = file1.getProperty("Firstname");
		String lastname = file1.getProperty("Lastname");
		String email = file1.getProperty("Email");
		String password = file1.getProperty("Password");
		String confirmpssword = file1.getProperty("Confirmpassword");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpssword);

		driver.findElement(By.id("register-button")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
