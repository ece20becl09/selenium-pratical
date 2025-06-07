package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailtextfiled;

	@FindBy(id = "Password")
	private WebElement passwordtextfiled;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginpagelink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutpagelink;
	
	

	public WebElement getLogoutpagelink() {
		return logoutpagelink;
	}

	public WebElement getEmailtextfiled() {
		return emailtextfiled;
	}

	public WebElement getPasswordtextfiled() {
		return passwordtextfiled;
	}

	public WebElement getLoginpagelink() {
		return loginpagelink;
	}

}
