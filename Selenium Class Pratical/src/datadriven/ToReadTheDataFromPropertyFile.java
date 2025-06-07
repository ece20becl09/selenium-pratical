package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Step 1:- Create an Object Of FileInputStream
		FileInputStream file = new FileInputStream("./TestData/testData.properties");

		// Step 2:- Create an object of PropertyFile
		Properties prop = new Properties();

		// Step 3:- call the methods
		prop.load(file);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		// Test Scripts
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

		Thread.sleep(4000);

		driver.quit();

	}

}
