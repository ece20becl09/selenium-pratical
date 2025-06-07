package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoWebShopUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./TestData/TestDataA3.xlsx");
		Workbook wob = WorkbookFactory.create(fis);

		// Step :-3 call methods
		String url = wob.getSheet("Sheet2").getRow(0).getCell(0).toString();
		String firstname = wob.getSheet("Sheet2").getRow(1).getCell(0).toString();
		String lastname = wob.getSheet("Sheet2").getRow(2).getCell(0).toString();
		String email = wob.getSheet("Sheet2").getRow(3).getCell(0).toString();
		String password = wob.getSheet("Sheet2").getRow(4).getCell(0).toString();
		String confirmpassword = wob.getSheet("Sheet2").getRow(5).getCell(0).toString();

		// Test Script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);

		driver.findElement(By.id("register-button")).click();

		Thread.sleep(4000);
		driver.quit();

	}

}
