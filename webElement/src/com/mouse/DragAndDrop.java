package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		 WebElement source = driver.findElement(By.id("box6"));
		 WebElement destination = driver.findElement(By.id("box106"));
		 
		 Actions act = new Actions(driver);
		 act.dragAndDrop(source, destination).build().perform();
		 
	}

}
