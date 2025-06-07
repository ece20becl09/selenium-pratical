package ClassAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckLoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String expectedtitlepagelogin = "Facebook – log in or sign up";
		String titleofwebpage = driver.getTitle();
		System.out.println(titleofwebpage);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		String actualloginpagetitle = driver.getTitle();
		if (actualloginpagetitle.equals(expectedtitlepagelogin)) {
			System.out.println("Succefully navigated to login page");

		} else {
			System.out.println("Failed to navigate to Facebook Login Page");
		}

		driver.quit();
	}

}
