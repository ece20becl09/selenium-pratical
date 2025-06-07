package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewCountTheTotalNumberOfLinksPresent {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//COUNT THE TOTAL NUMBER OF LINKS PRESENT IN THE WEBPAGE (INTERVIEW QUESTION)
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(4000);
		System.out.println(links.size());
		
		driver.quit();
	}

}
