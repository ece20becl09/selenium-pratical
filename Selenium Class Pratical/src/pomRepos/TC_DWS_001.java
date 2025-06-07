package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");

		// click on login link
		HomePageElementsForPOM pom = new HomePageElementsForPOM(driver);
		pom.getLoginlink().click();

		// Fill the email and password
		LoginPage page = new LoginPage(driver);
		page.getEmailtextfiled().sendKeys("SeleniumA3@gmail.com");
		page.getPasswordtextfiled().sendKeys("selenium@123");
		page.getLoginpagelink().click();
		page.getLogoutpagelink().click();

		driver.quit();

	}

}
