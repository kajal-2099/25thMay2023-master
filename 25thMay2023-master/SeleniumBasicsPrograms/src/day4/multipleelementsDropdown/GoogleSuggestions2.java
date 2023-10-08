package day4.multipleelementsDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.SeleniumUtil;

public class GoogleSuggestions2 {
	static WebDriver driver;
	public static void main(String[] args) {		
		driver=SeleniumUtil.setUp("firefox", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Testing interview questions");
		List<WebElement> sugg=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("Suggestion count: "+sugg.size());
		
		for(int i=0;i<sugg.size();i++) {
			//to avoid staleElementException re-identify the suggestion list
			sugg=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			WebElement element=sugg.get(i);
			String suggestion=element.getText();
			System.out.println("Suggestion found: "+suggestion);
			System.out.println("Suggestion contains searched text? "+suggestion.contains("testing interview questions"));
//					or
//			System.out.println("Suggestion contains searched text? "+sugg.get(i).getText().contains("Testing interview questions") +"\nSuggestion found: "+sugg.get(i).getText());
		}
	}
	
}
/**
print suggestion count
check all suggestion contains searched keyword
print name one by one
*/