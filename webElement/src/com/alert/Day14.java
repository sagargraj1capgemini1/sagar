package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://testautomationpractice.blogspot.com/");
		 //We cant do any thing untill unless we close the alert Window 
		 driver.findElement(By.tagName("button")).click();
		 Thread.sleep(5000);
		// driver.switchTo().alert().accept();//Clicks OK
		 driver.switchTo().alert().dismiss();
		 
	}

}
