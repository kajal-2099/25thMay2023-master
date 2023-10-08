package day6.propertyfilecalendar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) throws IOException {
		//load property file
		FileInputStream fis=new FileInputStream(".\\testData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browsername");
		String appUrl=prop.getProperty("url");
		
		WebDriver driver=setUp(browserName, appUrl);
		//read username from property file and pass it to username input field
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl=prop.getProperty("expectedHomePageUrl");
		System.out.println("Is login done? "+actualUrl.contains(expectedUrl));

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
