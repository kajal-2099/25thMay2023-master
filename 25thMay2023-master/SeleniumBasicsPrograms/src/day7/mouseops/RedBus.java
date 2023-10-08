package day7.mouseops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.redbus.in/");

		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(2000);

		if (driver.findElements(By.cssSelector(".search-box.clearfix>div>*")).size()==3) {
			driver.navigate().refresh();
			driver.findElement(By.id("src")).sendKeys("pune");
		}else {			
			List<WebElement> srcList = driver.findElements(By.cssSelector(".homeSearch>*"));
			System.out.println("Src list : " + srcList.size());
			for (int i = 0; i < srcList.size(); i++) {
				if (srcList.get(i).getText().contains("Swargate")) {
					srcList.get(i).click();
					break;
				}
			}
		}
	}

}
