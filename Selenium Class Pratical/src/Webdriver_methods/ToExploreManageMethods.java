package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethods {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();  // TO LAUNCH THE BROWSER
		driver.get("https://www.zomato.com/");     // NAVIGATE TO WINDOW

		// TO MAXIMIZE WINDOW
		// driver.manage().window().maximize();

		Thread.sleep(3000);

		// TO MINIMIZE WINDOW
		// driver.manage().window().minimize();

		// TO MAKE FULL SCREEN WINDOW
		// driver.manage().window().fullscreen();

//		// capture the size of the window
		Thread.sleep(3500);
		Dimension SizeOfTheBrowser = driver.manage().window().getSize();
		System.out.println(SizeOfTheBrowser);
		System.out.println(SizeOfTheBrowser.getWidth());
	    System.out.println(SizeOfTheBrowser.getHeight());

		// TO SET THE SIZE OF THE WINDOW
		// 1ST WAY
	    Thread.sleep(3000);
		Dimension d = new Dimension(1000, 50);
		driver.manage().window().setSize(d);
//
//		Thread.sleep(3000);
//		 2ND WAY
//		driver.manage().window().setSize(new Dimension(500, 800));

//		 GET POSITION OF BROWSER
//		Point PositionOfTheBrowser = driver.manage().window().getPosition();
//		System.out.println(PositionOfTheBrowser);
//		System.out.println(PositionOfTheBrowser.getX());
//		System.out.println(PositionOfTheBrowser.getY());

		// SET THE POSITION OF THE BROWSER
		// 1ST WAY
//		Point p = new Point(150, 150);
//		driver.manage().window().setPosition(p);
        
		//2ND WAY set the position of the browser
		//driver.manage().window().setPosition(new Point(200,200));
		//Thread.sleep(3000);
		driver.quit();

	}

}
