package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOver {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 WebElement admin= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
		 WebElement usermanage= driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		 WebElement user= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		 
		 Actions  a = new Actions(driver);
		 //To Mouse Hover WE will use MoveToElement
		 a.moveToElement(admin).moveToElement(usermanage).moveToElement(user).click().build().perform();
		
		 
	}

}
