package day5.dropdownhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "http://omayo.blogspot.com/");
		WebElement dropdown=driver.findElement(By.id("multiselect1"));
		
		Select select=new Select(dropdown);
		
		System.out.println(select.isMultiple());
		
		/**
		 * in multi select we get some additional functions like
		 * 	1- if you have selected multiple option and you want count for them dn use
		 * 			getAllSelectedOption() ---> List<WebElement>
		 * 	2- if you want to un-select selected option dn use
		 * 			deselectByIndex(int )
		 * 			deselectByValue(String)
		 * 			deselectByVisibleText(String)
		 * 			deselectAll()
		 *  3. We don;t have any method to select all option, for that we need write some logic 
		 */
		
		select.selectByValue("swiftx");
		select.selectByIndex(0);
		select.selectByIndex(2);
		
		System.out.println(select.getAllSelectedOptions().size());
		for(int i=0;i<select.getAllSelectedOptions().size();i++) {
			System.out.println(select.getAllSelectedOptions().get(i).getText());
		}
		
		select.deselectAll();

	}
	public static WebDriver setUp(String browserName, String appUrl) {
		WebDriver driver=null;
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
		return driver;
	}
}
