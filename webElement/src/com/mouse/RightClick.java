package com.mouse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		 
		 Actions a= new Actions(driver);
		 WebElement btn=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		 
		 a.contextClick(btn).build().perform();
		 driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		 Thread.sleep(2000);
		 Alert alert=driver.switchTo().alert();
		 
		 System.out.println(alert.getText());
         alert.accept();
	}

}
