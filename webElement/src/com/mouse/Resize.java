package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://testautomationpractice.blogspot.com/");
		 WebElement resize= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 act.moveToElement(resize).dragAndDropBy(resize, 250, 300).build().perform();
	}

}
