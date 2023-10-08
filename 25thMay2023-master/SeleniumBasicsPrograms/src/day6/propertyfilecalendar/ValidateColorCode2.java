package day6.propertyfilecalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class ValidateColorCode2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector(".errormsg"), "class", "errormsg"));
		Thread.sleep(2000);
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		//selenium get the color in RGBA format
		String msgColorCode=errorMsg.getCssValue("color");//
		String msgFontSize=errorMsg.getCssValue("font-size");
		System.out.println("Color code: "+msgColorCode);
		System.out.println(" font-size: "+msgFontSize);

	}

}
