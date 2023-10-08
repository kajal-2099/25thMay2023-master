package day4.multipleelementsDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example1 {
	static WebDriver driver;
	public static void main(String[] args) {
		setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Manual Interview Questions");
		//identify all the suggestions
		List<WebElement> suggestions=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div>*:first-child>span"));
		System.out.println("Total suggestions: "+suggestions.size());
		for(int i=0;i<suggestions.size();i++) {
			//to avoid StaleElementReferenceException, re-identify suggestion list
			suggestions=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div>*:first-child>span"));
			System.out.println(suggestions.get(i).getText());
		}
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
