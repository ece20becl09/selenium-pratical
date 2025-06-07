package Selfpraticse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterAccountInTutorialsNijaDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
        
		Thread.sleep(3000);
		WebElement MyAccountOption = driver.findElement(By.xpath("//span[text()='My Account']"));
		MyAccountOption.click();

		Thread.sleep(3000);
		WebElement RegisterButton = driver.findElement(By.xpath("//a[text()='Register']"));
		RegisterButton.click();

		Thread.sleep(3000);
		WebElement Firstname = driver.findElement(By.id("input-firstname"));
		Firstname.sendKeys("chotu");
		
		Thread.sleep(3000);
		
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.sendKeys("panda");
		
		Thread.sleep(3000);

		WebElement emailaddress = driver.findElement(By.id("input-email"));
		emailaddress.sendKeys("bapapanda44@gmail.com");
		
		Thread.sleep(3000);

		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("9090123144");
		
		Thread.sleep(3000);

		WebElement passowrd = driver.findElement(By.id("input-password"));
		passowrd.sendKeys("Bapa@890#");
		
		Thread.sleep(3000);

		WebElement confirmpassword = driver.findElement(By.id("input-confirm"));
		confirmpassword.sendKeys("Bapa@890#");
		
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio'and@value='0']"));
		action.click(radiobutton).perform();
		
		Thread.sleep(3000);

		WebElement agreebutton = driver.findElement(By.xpath("//input[@name='agree']"));
		action.click(agreebutton).perform();
		
		Thread.sleep(3000);

		WebElement submitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		action.click(submitbutton).perform();
		
		Thread.sleep(3000);

		driver.quit();
	}

}
