package vipro.sp.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import junit.framework.Assert;

public class PO_SearchPage {
	WebDriver driver;
	
	public PO_SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	/*
	//locators using simple Page Object Model
	By seacrhBar=By.name("q");
	  
	public static String seacrhBox="xpath#//textarea[@name='q']";//source- LSMV components
	*/
	
	//locators using PageFactory
	@FindBy(how=How.NAME,using="q")
	private WebElement seacrh_Box;
	
	@FindBy(how=How.XPATH,using="(//input[@value='Google Search'])[2]")
	private WebElement btn_search;
	
	//methods
	public void inputText(String arg) {
		seacrh_Box.sendKeys(arg);
		Reporter.log("Text entered in search box"+arg,true);
	}
	public void clickSearch() {
		btn_search.click();
		Reporter.log("clicked search button"+btn_search,true);
	}
	
	//business method
	public void  searchAnyhing(String arg) {
		inputText(arg);
		clickSearch();
		String actualTitle=driver.getTitle();
		String expectedTitle="* - Google Search";
		Assert.assertEquals(actualTitle, expectedTitle,"Not Same");
		Reporter.log("searched successfully"+arg,true);
	}
}
