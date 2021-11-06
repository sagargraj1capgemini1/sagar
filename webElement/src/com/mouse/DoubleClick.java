package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://testautomationpractice.blogspot.com/");
		 Actions act = new Actions(driver);
         WebElement btn=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
         act.doubleClick(btn).build().perform();
	}

}
