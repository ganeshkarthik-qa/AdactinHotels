package org.util;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static String ordno;
	
	public static void browserLaunch() {
	
		driver=new ChromeDriver();
	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String Url) {
	
		driver.get(Url);	
	}
	
	public static void sendText(WebElement w,String text) {
		
		w.sendKeys(text);
	}
	
	public static void implicitWait(int s) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	public static  WebDriverWait getWait() {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		return wait;
	}
	
	public static void btnClick(WebElement w) {
		
		w.click();
	}
	
	public static void dropDown(WebElement w,String value){
			
		Select object=new Select(w);
		
		object.selectByValue(value);
	}
	
	public static void orderNo() {
	     ordno = driver.findElement(By.xpath("//input[@id='order_no']")).getAttribute("value");
		System.out.println(ordno);
	}
		
	public static void quitBrowser() {

		driver.quit();

	}
	
	
	
}
