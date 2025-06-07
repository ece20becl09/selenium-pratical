package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToDemoWebShopAndCaptureErrorMessageOfColour {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriver driver2 = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver2.manage().window().maximize();
		
		driver2.get("https://www.instagram.com/?hl=en");
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String errormessage = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']")).getCssValue("color");
		System.out.println(errormessage);
		
		System.out.println("------------------------");
		
		
		System.out.println("--beore login button enabled and displayed");
		
		WebElement LoginButton = driver2.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());
		
		System.out.println("---------------------------");
		
		System.out.println("---AFTER ENTERING DATA----");
		driver2.findElement(By.name("username")).sendKeys("Ashim@gmail.com");
		driver2.findElement(By.name("password")).sendKeys("Ashim@123");
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());
		
		
		
		
		
		
		driver2.quit();
		driver.quit();
	}

}
