package ClassAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToZomato {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();  // Launch empty browser
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");    // Navigate to zomato webpage

		String CaptureTitleOfZomato = driver.getTitle();  // capture the title of zomato webpage
		System.out.println(CaptureTitleOfZomato);         // Print the getTittle Page Url

		String CurrentZomatoWebPageUrl = driver.getCurrentUrl();  // capture the Current zomato webpage url
		System.out.println(CurrentZomatoWebPageUrl);              //print the CurrentUrl Webpage Url
		
		driver.quit();
	}

}
