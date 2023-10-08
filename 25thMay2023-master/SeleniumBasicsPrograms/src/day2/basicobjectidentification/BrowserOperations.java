package day2.basicobjectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		//open browser and enter application url
		WebDriver driver=setUp("chrome", "https://demo.automationtesting.in/Register.html");
		//to maximize browser window 
		driver.manage().window().maximize();
		//to minimize you need to user setSize() method
		driver.manage().window().setSize(new Dimension(500, 600));
		//to maximize browser window 
		driver.manage().window().maximize();
		//click on WebTable link
		driver.findElement(By.linkText("WebTable")).click();
		//if you want to come back to previous page dn use
		driver.navigate().back();
		//if you want to goto next page again dn use
		driver.navigate().forward();
		//if you want to reload current page
		driver.navigate().refresh();
		//if you want to move to another application/url dn use
		driver.navigate().to("https://www.google.com");
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
		driver.get(appUrl);
		return driver;
	}
}
