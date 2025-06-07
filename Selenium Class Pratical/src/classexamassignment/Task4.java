package classexamassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task4 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.barbequenation.com/");
		
		String Session = driver.getWindowHandle();
		System.out.println(Session);
		
	    String UrlOfTheWebPage = driver.getCurrentUrl();
	    System.out.println(UrlOfTheWebPage);
	    
	    Dimension SizeOfTheBrowser = driver.manage().window().getSize();
	    System.out.println(SizeOfTheBrowser);
	    
	   Point positionOfTheBrowser = driver.manage().window().getPosition();
	   System.out.println(positionOfTheBrowser);
	   
	   driver.quit();
	   
	}

}
