package testcases.qliro;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.qliro.ForetagPage;
import objectRepository.qliro.HomePage;
import objectRepository.qliro.InvestorRelationPage;


public class NewUserJourney {

	@Test
	public void userJourney1() throws Exception {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		acceptCookies(driver);
		
		clickLogin(driver);
		
		clickOrByEmailLink(driver);
		
		sendTextToEmailLogin(driver,"qliro123@test.com");
		
		verifyAlertMessage(driver,"Du har fått mejl!");
		
		clickOnForetag(driver);
		
		scrollDown(driver);
		
	    selectLanguageUK(driver);
		
		verifyLanguageEnglish(driver);
		
		clickSideBar(driver);
		
		clickInvestorRelationLink(driver);
		
		scrollToVaraSenaste(driver);
		
		clickSeAllaLink(driver);
		
		clickVisaFlerLink(driver);
		
		scrollDown(driver);
		
		sendTextToEmailInvestorRel(driver,"qliro123@test.com");
		
		clickPressReleaseCheckBox(driver);
		
		verifyAlertMessage(driver,"Vänligen godkänn de generella villkoren");
		
		takeSnapShot(driver,"screenshot/screenshot.png");
		
		Thread.sleep(5000);
		
		driver.close();

	}

	private void clickLogin(WebDriver driver) {
		HomePage mhp = new HomePage(driver);
		mhp.loginButtonPath().click();
        
	}

	
	
	private void acceptCookies(WebDriver driver) {
		HomePage mhp = new HomePage(driver);
		mhp.acceptAllCookiePath().click();
		
	}
	
	private void clickOrByEmailLink(WebDriver driver) {
		HomePage mhp = new HomePage(driver);
		mhp.orByEmailLinkPath().click();
        
	}
	
	private void sendTextToEmailLogin(WebDriver driver,String text) {
		HomePage mhp = new HomePage(driver);
		mhp.emailTextBoxPath().sendKeys(text);
		mhp.emailTextBoxPath().sendKeys(Keys.ENTER);
        
	}
	
	private void verifyAlertMessage(WebDriver driver,String text) {
		if ( !driver.getPageSource().contains(text)){
	         Assert.fail(text+" element is not found");
	      } 
        
	}
	
	private void clickOnForetag(WebDriver driver) {
		ForetagPage mhp = new ForetagPage(driver);
		mhp.foretagLink_Path().click();
        
	}
	
	private void scrollDown(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		
	}
	
	
	private void selectLanguageUK(WebDriver driver)
	{
		ForetagPage mhp = new ForetagPage(driver);
		mhp.langImgUK_Path().click();
	}
	
	private void verifyLanguageEnglish(WebDriver driver)
	{
		ForetagPage mhp = new ForetagPage(driver);
		if (!mhp.getInTouch_Path().isDisplayed()){
	         Assert.fail(" language not changed");
	      } 
	}
	
	private void clickSideBar(WebDriver driver)
	{
		ForetagPage mhp = new ForetagPage(driver);
		mhp.sideBar_Path().click();
	}

	private void clickInvestorRelationLink(WebDriver driver)
	{
		InvestorRelationPage mhp = new InvestorRelationPage(driver);
		mhp.investorRelationLinkPath().click();
	}
	
	private void scrollToVaraSenaste(WebDriver driver)
	{
		InvestorRelationPage mhp = new InvestorRelationPage(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mhp.varaSenastePath());
	}
	
	private void clickSeAllaLink(WebDriver driver)
	{
		InvestorRelationPage mhp = new InvestorRelationPage(driver);
		mhp.seAllaLinkPath().click();
	}
	
	private void clickVisaFlerLink(WebDriver driver)
	{
		InvestorRelationPage mhp = new InvestorRelationPage(driver);
		mhp.visaFlerLinkPath().click();
	}
	
	private void sendTextToEmailInvestorRel(WebDriver driver,String text) {
		InvestorRelationPage mhp = new InvestorRelationPage(driver);
		mhp.emailTextBoxPath().sendKeys(text);        
	}

	private void clickPressReleaseCheckBox(WebDriver driver)
	{
		InvestorRelationPage mhp = new InvestorRelationPage(driver);
		mhp.pressReleaseCheckBoxPath().click();
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception
	{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileHandler.copy(SrcFile, DestFile);
    }
	
}
