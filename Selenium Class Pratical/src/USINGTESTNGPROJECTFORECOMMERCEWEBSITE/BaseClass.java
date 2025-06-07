package USINGTESTNGPROJECTFORECOMMERCEWEBSITE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Actions actions;

	String expectedHomepagetitle = "Demo Web Shop";

	@BeforeClass
	public void toLaunch() {
		driver = new ChromeDriver();
		Reporter.log("Browser Got Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitleofhomepage = driver.getTitle();
		if (actualtitleofhomepage.equals(expectedHomepagetitle)) {
			Reporter.log("Successfully navigated to Demo Web Page", true);

		} else {
			Reporter.log("Failed to navigate to Demo Web", true);
		}

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ece.20becl09@silicon.ac.in");
		driver.findElement(By.id("Password")).sendKeys("Chotu@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Login Successfully to Demo Web Shop Tricentis", true);

	}

	@AfterMethod
	public void toLogout() throws InterruptedException {
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		Reporter.log("Account Successfully Logout", true);
	}

	@AfterClass
	public void toCloseBrowser() {
		driver.quit();
		Reporter.log("Browser Successfully Closed", true);
	}

}
