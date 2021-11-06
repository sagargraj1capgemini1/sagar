package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase 
	{
	public static WebDriver driver;
	    @Test
	    void openUrl()
	    {
	      System.out.println("Insideing OpenUrl");
	    }
	    @Test
	    void login() 
	    {
	    	 System.out.println("Insideing Login");
	    }	    
}
