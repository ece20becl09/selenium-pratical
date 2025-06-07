package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// To Switch to frame
		driver.switchTo().frame("login_page");
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(3000);

		// To Handle Alert Popup
		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		// alertpopup.accept(); //Click on ok button
		Thread.sleep(3000);
		alertpopup.dismiss();

		driver.quit();

	}

}
