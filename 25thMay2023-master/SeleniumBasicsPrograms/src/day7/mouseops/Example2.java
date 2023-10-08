package day7.mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.SeleniumUtil;

public class Example2 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.saucedemo.com/");
		
		String usernames=driver.findElement(By.id("login_credentials")).getText();
		System.out.println("Username: "+usernames);
		String[] userNameList=usernames.split("\n");
		
		System.out.println("1st username is: "+userNameList[1]);
	
	}
}
