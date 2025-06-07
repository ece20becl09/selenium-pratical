package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); // START THE SERVER
		driver.get("https://www.zomato.com/"); // NAVIGATE TO WEBPAGE

		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();

		Thread.sleep(3000); // PAUSE THE SERVER FOR 3SECONDS
		driver.quit(); // IT WILL CLOSE THE BOTH PARENT AND CHILD WINDOW AND STOP THE SERVER
	}

}
