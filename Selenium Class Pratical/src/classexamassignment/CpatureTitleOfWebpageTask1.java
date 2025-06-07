package classexamassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class CpatureTitleOfWebpageTask1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.get("https://in.kalkifashion.com/");
		String TittleOfwebpage = driver.getTitle();
		System.out.println(TittleOfwebpage);
		driver.quit();
	}

}
