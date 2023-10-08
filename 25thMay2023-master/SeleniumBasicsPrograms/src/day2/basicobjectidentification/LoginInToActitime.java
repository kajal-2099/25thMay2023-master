package day2.basicobjectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginInToActitime {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=setUp("chrome");
		//enter application URL
		driver.get("https://demo.actitime.com/login.do");
		//validate login page
		String expectedTitle="actiTIME - Login";
		String actutalTitle=driver.getTitle();
		if(actutalTitle.equals(expectedTitle)) {
			System.out.println("Login page validation is passed");
		}else {
			System.out.println("Login page validation is failed");
		}
		//enter username as admin
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		//enter password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on Login button
		driver.findElement(By.id("loginButton")).click();
	}
	
	public static WebDriver setUp(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
/*
 open browser
 enter application url
 validate login page opened or not
 enter username as admin
 enter password as manager
 click on login button
 close browser
 */
