package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldAlligned {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		// User Name Text Field
		int x1 = driver.findElement(By.id("email")).getRect().getX();
		System.out.println(x1);

		int x2 = driver.findElement(By.id("pass")).getRect().getY();
		System.out.println(x2);

		if (x1 == x2) {
			System.out.println("Facebook Login and Password filed properly alligned");
		} else {
			System.out.println("Facebook login and password field not alligned properly");
		}

		driver.quit();
	}

}
