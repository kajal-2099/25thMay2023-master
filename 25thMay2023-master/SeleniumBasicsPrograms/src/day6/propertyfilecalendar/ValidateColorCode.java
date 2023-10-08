package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtil;

public class ValidateColorCode {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.redbus.in/");
		
		WebElement searchButton=driver.findElement(By.id("search_button"));
		//selenium get the color in RGBA format
		String buttonTextColorCode=searchButton.getCssValue("color");
		String buttonColorCode=searchButton.getCssValue("background");//
		String buttonFontSize=searchButton.getCssValue("font-size");
		System.out.println("Button text color code: "+buttonTextColorCode);
		System.out.println("Color code: "+buttonColorCode);
		System.out.println("Button font-size: "+buttonFontSize);

	}

}
