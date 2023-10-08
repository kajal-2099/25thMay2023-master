package day4.multipleelementsDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class DemoBlazeDeviceCountAndName {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.demoblaze.com/");
		//get all the device using findElements(By)
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> devicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		//once you get all the element you can use size method to the count
		System.out.println("Device count is: "+deviceList.size());
		//get a particular element from the list
//		WebElement element=deviceList.get(0);
//		System.out.println("First device name is: "+element.getText());
//				//or
//		System.out.println("First device name is: "+deviceList.get(0).getText());
		//to print all device name one by one use for loop
		for(int i=0;i<deviceList.size();i++) {
			System.out.println("device Details- "+deviceList.get(i).getText()+" : "+devicePrice.get(i).getText());
		}
	}
}
