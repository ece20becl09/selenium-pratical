package Selfpraticse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CountAndPrintHyperLinkInCalculatorWebSite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.calculator.net/");
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

		System.out.println(" Total Links Present In The WebPage " + hyperlinks.size());

		for (WebElement links : hyperlinks) {
			System.out.println(links.getText());
		}

		WebElement sevennumber = driver.findElement(By.xpath("//span[text()='7']"));
		WebElement eightnumber = driver.findElement(By.xpath("//span[text()='8']"));
		WebElement addition = driver.findElement(By.xpath("//span[text()='×']"));
		WebElement fournumber = driver.findElement(By.xpath("//span[text()='4']"));
		WebElement fivenumber = driver.findElement(By.xpath("//span[text()='5']"));
		WebElement output = driver.findElement(By.id("sciOutPut"));

		Thread.sleep(3000);
		Actions actions = new Actions(driver);

		actions.click(sevennumber).perform();
		actions.click(eightnumber).perform();
		actions.click(addition).perform();
		actions.click(fournumber).perform();
		actions.click(fivenumber).perform();

		Thread.sleep(3000);
		System.out.println(output.getText());

		driver.quit();
	}

}
