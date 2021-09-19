package testcases.qliro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}}