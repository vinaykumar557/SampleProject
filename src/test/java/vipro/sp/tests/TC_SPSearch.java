package vipro.sp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import vipro.sp.pages.PO_SearchPage;
import vipro.sp.utils.BrowserManager;

public class TC_SPSearch {
	WebDriver driver;
	@Test
	@Parameter()
	public void TC01_LaunchURL(String url) {
		driver=BrowserManager.getDriver("chrome");
		driver.get(url);
	}
	@Test
	@Parameter()
	public void TC02_Search(String url, String browser) {
		driver=BrowserManager.getDriver(browser);
		driver.get(url);
		
		PO_SearchPage sp=PageFactory.initElements(driver,PO_SearchPage.class);
		sp.searchAnyhing("hello");
	}

}
