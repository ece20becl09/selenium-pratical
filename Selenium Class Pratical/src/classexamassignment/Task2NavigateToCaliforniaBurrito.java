package classexamassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2NavigateToCaliforniaBurrito {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.californiaburrito.in/");

		String urlofwebpage = driver.getCurrentUrl();
		System.out.println(urlofwebpage);

		
		driver.quit();
	}

}
