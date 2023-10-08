package day4.multipleelementsDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class FlipkartMenus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtil.setUp("firefox", "https://www.flipkart.com/");
		try {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("._37M3Pb>div>a>*:nth-child(2)"));
		for(WebElement element: mainMenu) {
			System.out.println(element.getText());
		}
		String[] str="Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.;Mobile Phones Big Saving Days B2 Sd31 Store Online - Buy Mobile Phones Big Saving Days B2 Sd31 Online at Best Price in India | Flipkart.com;Big Saving Days May Sale Store Online - Buy Big Saving Days May Sale Online at Best Price in India | Flipkart.com;Tv & Appliances Big Saving Days Sale: 4th - 10th May | Upto 75% Off;Fashion Bsd May23 Branded Store Online - Buy Fashion Bsd May23 Branded Online at Best Price in India | Flipkart.com;Big Saving Day May2023 Store Online - Buy Big Saving Day May2023 Online at Best Price in India | Flipkart.com;Bsd Hnf Sale Dec 22 Store Online - Buy Bsd Hnf Sale Dec 22 Online at Best Price in India | Flipkart.com;Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com;Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com".split(";");
		for(int i=0;i<mainMenu.size();i++) {
			mainMenu.get(i).click();
			SeleniumUtil.wait.until(ExpectedConditions.titleIs(str[i]));
			System.out.println(driver.getTitle());
			driver.navigate().back();
			mainMenu=driver.findElements(By.cssSelector("._37M3Pb>div>a>*:nth-child(2)"));
		}
		
	}

}
