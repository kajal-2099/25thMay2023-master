package day4.multipleelementsDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class BrowserOps2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {		
		setUp("chrome", "https://demo.actitime.com/login.do");	
		//first identify the element
		WebElement userNameText=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(1)>*:last-child"));
		//get the entire text
		String userNameWithLabel=userNameText.getText();
		//get the required text using replace method of String class
		String userName=userNameWithLabel.replace("Username: ", "");
					//or
		//String username=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(1)>*:last-child")).getText().replace("Username: ", "");
		
		//first identify the element
		WebElement passwordText=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(2)>*:last-child"));
		//get the entire text
		String passwordWithLabel=passwordText.getText();
		//get the require text using split method of String class in the form String array
		String[] password=passwordWithLabel.split(" ");
				//or
		//String[] pwd=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(2)>*:last-child")).getText().split(" ");
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password[1]);
		driver.findElement(By.id("loginButton")).click();
	}
	public static void setUp(String browserName, String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// enter the required URL
		driver.get(appUrl);	
	}
}
