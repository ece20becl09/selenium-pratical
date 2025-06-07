package ClassAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToJioMartAndPrintTheAllAtribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.jiomart.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='header-nav-l1 custom-scrollbar']/li/a"));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		driver.quit();
	}

}
