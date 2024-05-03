package vipro.sp.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BrowserManager {
		
	public static WebDriver getDriver(String type) {
		WebDriver driver=null;
		
		if(type.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}else if(type.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}else if(type.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			Assert.assertTrue(false,"Browser type not found");
		}
		return driver;
		 
	}

}
