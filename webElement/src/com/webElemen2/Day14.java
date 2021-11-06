package com.webElemen2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        /*
         * Wait Commands
         * LInks 
         * Frames 
         * Browser Windows 
         */
		 System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		 driver.get("http://demo.guru99.com/test/newtours/");
		// Thread.sleep(5000);//Untill and unless it complete 2 sec it will not go to next statement (Performance Issue)
		 driver.findElement(By.name("userName")).sendKeys("Mercury");
		 WebDriverWait mywait = new WebDriverWait(driver,1000);//TO you explicit wait we need to create an WebDriverWait Object 
		 //Explict Wait will wait for an element  
		 //mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		 List <WebElement> list =driver.findElements(By.tagName("a"));
		 System.out.println(list.size());
		 for(WebElement a : list) {
			 
			 System.out.println(a.getText());
		 }
		 
	}

}
