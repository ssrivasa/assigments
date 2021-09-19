package objectRepository.qliro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForetagPage {

	WebDriver driver;

	
	
	@FindBy(xpath = "//span[text()='Företag']")
	WebElement foretag_link;
	
	@FindBy(xpath = "//h3[text()='Intresserad av nästa steg?']")
	WebElement nasta_steg_text;
	
	@FindBy(xpath = "//*[name()='svg' and @class='sc-fzXfQn izkiAy']")
	WebElement close_side_bar;
	
	@FindBy(xpath = "//img[contains(@src,'uk+1')]")
	WebElement language_image_uk;
	
	@FindBy(xpath = "//div[text()='Get in touch']")
	WebElement get_in_touch_link;
	
	@FindBy(xpath = "//*[name()='svg' and @class='sc-fzXfNS sc-fzXfOr iLJsGc']")
	WebElement side_bar;
	
	

	public ForetagPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement foretagLink_Path() {
		return foretag_link;
	}
	
	public WebElement nastaStegText_Path() {
		return nasta_steg_text;
	}
	
	public WebElement closeSideBar_Path() {
		return close_side_bar;
	}
	
	public WebElement langImgUK_Path() {
		return language_image_uk;
	}
	
	public WebElement getInTouch_Path() {
		return get_in_touch_link;
	}
	
	public WebElement sideBar_Path() {
		return side_bar;
	}
}
