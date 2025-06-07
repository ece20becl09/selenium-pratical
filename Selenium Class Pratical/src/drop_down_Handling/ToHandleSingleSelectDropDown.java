package drop_down_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		// Identify DropDown
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));

		// To Handle use Select class
		Select day = new Select(daydropdown);
		Select month = new Select(monthdropdown);
		Select year = new Select(yeardropdown);

		day.selectByIndex(2);
		Thread.sleep(3000);
		month.selectByValue("3");
		Thread.sleep(3000);
		year.selectByVisibleText("2002");

		// To Check Whether dropdown is single or multiselect

		System.out.println(day.isMultiple());
		System.out.println(month.isMultiple());
		System.out.println(year.isMultiple());

		// Capture every option in dropdown

//		List<WebElement> allmonths = month.getOptions();
//		for (WebElement months : allmonths) {
//			System.out.println(months.getText());
////			month.selectByVisibleText(months.getText());
////			Thread.sleep(2000);
//
//		}
//
//		// capture every option of year
//
//		List<WebElement> allyears = year.getOptions();
//		for (WebElement years : allyears) {
//			System.out.println(years.getText());
////			year.selectByVisibleText(years.getText());
////			Thread.sleep(2000);
//
//		}

		driver.quit();

	}

}
