package objectRepository.qliro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(id = "header-login-btn")
	WebElement login_button;
	
	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement acceptCookies_button;
	
	@FindBy(xpath = "//h4[text()='Eller med mejl']")
	WebElement orbyemail_link;
	
	@FindBy(name = "email")
	WebElement email_textbox;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	
	
	public WebElement loginButtonPath() {
		return login_button;
	}
	
	public WebElement acceptAllCookiePath() {
		return acceptCookies_button;
	}
	
	public WebElement orByEmailLinkPath() {
		return orbyemail_link;
	}
	
	public WebElement emailTextBoxPath() {
		return email_textbox;
	}
	
	
}
