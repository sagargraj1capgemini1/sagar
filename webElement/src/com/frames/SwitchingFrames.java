package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver//chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		 //driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hello");
	}

}
