package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class MakeMyTripCalender {

	public static void main(String[] args) {
			
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.makemytrip.com/");
		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//select date from next month
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(4)>div>p")).click();
	}

}
