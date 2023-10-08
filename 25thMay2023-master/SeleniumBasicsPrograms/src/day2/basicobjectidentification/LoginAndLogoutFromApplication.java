package day2.basicobjectidentification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndLogoutFromApplication {

	public static void main(String[] args) {
		//open chrome browser
		WebDriver driver = setUp("chrome");
		// enter application url
		driver.get("https://www.saucedemo.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// print page title, 0-30 sec time to get the element
		System.out.println("Login page title: " + driver.getTitle());
		
		/*first identify required element and perform action on it, 0-30 sec time to get the element */
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		/*first identify required element and perform action on it, 0-30 sec time to get the element*/
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//click on login button,0-30 sec time to get the element
		driver.findElement(By.id("login-button")).click();
		
		//click on navigation pannel,0-30 sec time to get the element
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		//click on logout link,0-30 sec time to get the element
		driver.findElement(By.linkText("Logout")).click();
		//close browser
		driver.close();
	}

	public static WebDriver setUp(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			/* 2. After setting the path of driver executable, create an instance of required browser */
			return new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new InternetExplorerDriver();
		}
		return null;
	}
}
/**
 * open chrome browser 
 * enter application url 
 * print login page title 
 * enter username 
 * enter password 
 * click on login button 
 * print page title 
 * close the browser
 */
