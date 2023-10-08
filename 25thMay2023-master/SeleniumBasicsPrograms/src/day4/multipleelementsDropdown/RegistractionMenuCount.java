package day4.multipleelementsDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class RegistractionMenuCount {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		//get all the menu using findElements(By)
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		System.out.println("Total Menu count: "+menuList.size());
		
//		//to get specific WebElement from the list
//		WebElement firstMenu=menuList.get(0);
//		String menuName=firstMenu.getText();
//		System.out.println("First Menu name: "+menuName);
//					//or
//		System.out.println("First Menu name: "+menuList.get(0).getText());
		
		//to print all menu names one by one using loop
//		for(int i=0;i<menuList.size();i++) {
//			System.out.println("Menu name: "+menuList.get(i).getText());
//		}
		
		for(WebElement element:menuList) {
			System.out.println("Manu name: "+element.getText());
		}

	}

}
