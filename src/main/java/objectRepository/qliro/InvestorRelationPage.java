package objectRepository.qliro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestorRelationPage {

	WebDriver driver;

	
	@FindBy(xpath = "//h3[text()='Investor Relations']")
	WebElement investor_relation_link;
	
	@FindBy(xpath = "//h3[text()='Våra senaste pressmeddelanden']")
	WebElement vara_senaste;
	
	@FindBy(xpath = "//div[text()='Se alla']")
	WebElement se_alla_link;
	
	@FindBy(xpath = "//p[text()='Visa fler']")
	WebElement visa_fler_link;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email_textbox;
	
	@FindBy(xpath = "//p[text()='Pressmeddelanden']")
	WebElement pressrelease_checkbox;
	
	@FindBy(xpath = "//button[text()='Prenumerera']")
	WebElement prenumerera_button;
	
	
	
	
	public InvestorRelationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	
	
	public WebElement investorRelationLinkPath() {
		return investor_relation_link;
	}
	
	public WebElement varaSenastePath() {
		return vara_senaste;
	}
	
	public WebElement seAllaLinkPath() {
		return se_alla_link;
	}
	
	public WebElement visaFlerLinkPath() {
		return visa_fler_link;
	}
	
	public WebElement emailTextBoxPath() {
		return email_textbox;
	}
	
	public WebElement pressReleaseCheckBoxPath() {
		return pressrelease_checkbox;
	}
	
	public WebElement prenumereraButtonPath() {
		return prenumerera_button	;
	}
}
