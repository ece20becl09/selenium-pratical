package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElementsForPOM {

	// Constructors
	public HomePageElementsForPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistlink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

}
