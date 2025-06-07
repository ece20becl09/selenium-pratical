package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");//NAVIGATE TO REGISTER ACCOUNT
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();//CLICK ON EXPERIENCED
		
		//To Avoid File Upload Pop-Up
		Thread.sleep(2000);
		driver.findElement(By.id("resumeUpload")).sendKeys("D:\\RESUME FOLDER\\ASHIM_MAHAPATRO_QA_Engg_8+Months.pdf");
		//Input tag of upload button
		
		Thread.sleep(5000);
		driver.quit();		
	
	
	
	}

}
