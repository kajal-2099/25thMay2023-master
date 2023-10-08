package day4.multipleelementsDropdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class DemoBlaze {
	static WebDriver driver;
	public static void main(String[] args) {		
		driver=SeleniumUtil.setUp("chrome", "https://www.demoblaze.com/");
		//identify all mobile devices
		List<WebElement> mobileList=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h4>a"));
		System.out.println("Total mobile found: "+mobileList.size());
		//print one by one all the suggestions in the console
		for(int i=0;i<mobileList.size();i++) {
			WebElement mobile=mobileList.get(i);
			System.out.println("Mobile name "+i+": "+mobile.getText());
		}
	}
	
}
