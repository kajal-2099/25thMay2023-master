package day6.propertyfilecalendar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ColorFontSizeAndPositionValidation {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\testData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browsername");
		String appUrl=prop.getProperty("url");
		
		WebDriver driver=setUp(browserName, appUrl);
		//read username from property file and pass it to username input field
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		
		WebElement loginButton=driver.findElement(By.cssSelector(".orangehrm-login-button"));
		System.out.println("login button font color: "+loginButton.getCssValue("color"));
		System.out.println("login button background color: "+loginButton.getCssValue("background-color"));
		System.out.println("login button font size: "+loginButton.getCssValue("font-size"));
		loginButton.click();
		
		WebElement errorMsg=driver.findElement(By.cssSelector(".oxd-input-group__message"));
		//get x,y co-cord of error msg
		Point errorPoint=errorMsg.getLocation();
		int errorMsg_x=errorPoint.getX();
		int errorMsg_y=errorPoint.getY();
		System.out.println("errorMsg x: "+errorMsg_x+"\terrorMsg y: "+errorMsg_y);
		//get x,y co-cord of Login button
		Point loginPoint=loginButton.getLocation();
		int loginButton_x=loginPoint.getX();
		int loginButton_y=loginPoint.getY();
		System.out.println("loginButton x: "+loginButton_x+"\tloginButton y: "+loginButton_y);
		//validation - above Login button "required" text should be displayed
		System.out.println("is error msg displayed above login button? "+(errorMsg_y<loginButton_y));
		
		//validation- "Required" text should be in RED color
		String errorMsgColorCode=errorMsg.getCssValue("color");
		String expectedErrorMsgColorCode=prop.getProperty("errorMsgColorCode");
		System.out.println("is error msg color RED? "+errorMsgColorCode.equals(expectedErrorMsgColorCode));
		
		//validation- "Required" text font size should be 12
		String errorMsgFontSize=errorMsg.getCssValue("font-size");
		String expectedErrorMsgFontSize=prop.getProperty("errorMsgFontSize");
		System.out.println("is error msg font 12px? "+errorMsgFontSize.equals(expectedErrorMsgFontSize));
		/*
		 validate-
			1. above Login button "required" text should be displayed
			2. "Required" text should be in RED color
			3. "Required" text font size should be 12
		 */
		
	}
	public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
/*
Open browser and enter application URL
enter username as Admin
click on login button
validate-
	1. below password input field "required" text should be displayed
	2. "Required" text should be in RED color
	3. "Required" text font size should be 12
	
https://www.saucedemo.com/
Validate-
	error msg below password field
	Login button color, text color, font size
*/