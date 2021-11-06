package com.keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/key_presses");
		 Actions a = new Actions(driver);
		 a.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(2000);
		 a.sendKeys(Keys.CONTROL+"a").build().perform();
	}

}
