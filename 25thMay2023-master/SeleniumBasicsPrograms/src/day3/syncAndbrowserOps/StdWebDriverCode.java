package day3.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StdWebDriverCode {

	public static void main(String[] args) {
		/*
		 * open required browser 
		 * implicit wait 
		 * maximize browser window 
		 * enter application URL
		 */
		// set required browser driver executable path using:  System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.actitime.com/login.do");
	}

}
