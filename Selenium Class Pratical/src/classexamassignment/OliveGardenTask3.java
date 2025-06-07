package classexamassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class OliveGardenTask3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.navigate().to("https://www.olivegarden.com/home");
         
		Thread.sleep(3000);
		Dimension SizeOfThewebpage = driver.manage().window().getSize();
		System.out.println(SizeOfThewebpage.getHeight());
		System.out.println(SizeOfThewebpage.getWidth());

		driver.manage().window().setSize(new Dimension(500, 500));
		
		driver.quit();
	}

}
