package ClassAssignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetTheSizeOfbarbequenation {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		Navigation nav = driver.navigate();
		driver.navigate().to("https://www.barbequenation.com/");
		nav.refresh();

		Thread.sleep(4000);
		driver.manage().window().maximize();

		Thread.sleep(6000);
		// 1st way TO SET THE POSITION OF THE BROWSER
//		driver.manage().window().setPosition(new Point(600, 600));
//		Point positionofthebrowser = driver.manage().window().getPosition();
//		System.out.println(positionofthebrowser.getX());
//		System.out.println(positionofthebrowser.getY());

		// 2nd way TO SET THE POSITION OF THE WINDOW
		Thread.sleep(9000);
		Point p = new Point(150, 150);
		driver.manage().window().setPosition(p);
		Point positionofthewindow = driver.manage().window().getPosition();
		System.out.println(positionofthewindow);

		Thread.sleep(4200);
		// set the size of the browser
		driver.manage().window().setSize(new Dimension(600, 1000));
		Dimension postiontionofthewindow = driver.manage().window().getSize();
		System.out.println(postiontionofthewindow);
		System.out.println(postiontionofthewindow.getHeight());
		System.out.println(postiontionofthewindow.getWidth());

		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.quit();

	}

}
