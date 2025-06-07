package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvertedToFacebookTestCaseToAutomationTestScript {

	public static void main(String[] args) throws IOException {

		// Expected Data
		String expectedloginpagetitle = "Facebook – log in or sign up";
		String expectedemail = "ashimmahapatro2001@gmail.com";
		String expectedpassword = "ashim@2002";
		String expctedtitle = "(20+) Facebook";

		FileInputStream fis = new FileInputStream("./TestData/demowebshop.xlsx");
		Workbook wob = WorkbookFactory.create(fis);

		String url = wob.getSheet("Sheet2").getRow(0).getCell(0).toString();
		String email = wob.getSheet("Sheet2").getRow(1).getCell(0).toString();
		String password = wob.getSheet("Sheet2").getRow(2).getCell(0).toString();

		// Launch The Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got launched");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Enter the url
		driver.get(url);
		String actualloginpagetitle = driver.getTitle();
		if (actualloginpagetitle.equals(expectedloginpagetitle)) {
			System.out.println("Successfully navigate to login page");
		} else {
			System.out.println("Failed to navigate to Facebook login page");
		}

		// Enter the username into username textfiled
		WebElement usernametextfiled = driver.findElement(By.id("email"));
		usernametextfiled.clear();
		usernametextfiled.sendKeys(email);
		String actualusername = usernametextfiled.getAttribute("value");
		if (actualusername.equals(expectedemail)) {
			System.out.println("Username Textfiled Successfully Accpeted data");

		} else {
			System.out.println("Username Textfiled failed to accpet data");
		}

		// Enter passowrd into textfiled
		WebElement passwordtextfiled = driver.findElement(By.id("pass"));
		passwordtextfiled.clear();
		passwordtextfiled.sendKeys(password);
		String actualpassword = passwordtextfiled.getAttribute("value");
		if (actualpassword.equals(expectedpassword)) {
			System.out.println("Password Textfiled Successfully accpted data");

		} else {
			System.out.println("passowrd textfiled failed to accpted data");
		}

		// click on login button
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		System.out.println("Navigated successfully to homepage");

		// navigate to home page
		String actualtitleofwebpage = driver.getTitle();
		if (actualtitleofwebpage.equals(expctedtitle)) {
			System.out.println("Suucessfully navigate To facebook homepage");
		} else {
			System.out.println("Failed to navigate to facebook homepage");
		}

		// Click On Logout Button
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0]", args);

		// Close The broswer
		System.out.println("browser got close successfully");
		driver.quit();

	}

}
