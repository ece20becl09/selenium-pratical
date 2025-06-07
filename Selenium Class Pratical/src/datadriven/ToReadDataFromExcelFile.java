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

public class ToReadDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		// Step 1:- Create an object of FileInputStream
		FileInputStream fis = new FileInputStream("./TestData/TestDataA3.xlsx");

		// Step 2:- Create An Object Of WorkBook
		Workbook wb = WorkbookFactory.create(fis);

		// Step 3:- Call Methods
		String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();

		// Test Script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);

		Thread.sleep(3000);
		driver.quit();

	}

}
