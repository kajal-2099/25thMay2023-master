package day2.basicobjectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationOnApplication {

	public static void main(String[] args) {
		//open browser and enter application url
		WebDriver driver=setUp("chrome", "https://demo.automationtesting.in/Register.html");
		//firstName input field- visible, editable, default
		WebElement firstNameInputField=driver.findElement(By.className("form-control"));
		System.out.println("is first name input field visible? "+firstNameInputField.isDisplayed());
		System.out.println("is first name input field editable? "+firstNameInputField.isEnabled());
		System.out.println("default valud of first name input field: "+firstNameInputField.getAttribute("placeholder"));
		
		//submit button - visible, clickable, button name
		WebElement submitButton=driver.findElement(By.id("submitbtn"));
		System.out.println("is submit button visible? "+submitButton.isDisplayed());
		System.out.println("is submit button clickable? "+submitButton.isEnabled());
		System.out.println("button text is: "+submitButton.getText());
		
		//radio button - visible, clickable, after/before selection
		WebElement maleRadioButton=driver.findElement(By.name("radiooptions"));
		System.out.println("is male radio button displayed? "+maleRadioButton.isDisplayed());
		System.out.println("is male radio button functional? "+maleRadioButton.isEnabled());
		System.out.println("is male radio button already selected? "+maleRadioButton.isSelected());
		maleRadioButton.click();
		System.out.println("is male radio button already selected? "+maleRadioButton.isSelected());
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
		return driver;
	}
}
