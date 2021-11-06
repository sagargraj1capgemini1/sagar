package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TNG_001  {
  
	
  public static WebDriver driver;
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String url) 
  {
	  if(url.equals("chrome")) {
	     System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		 driver = new ChromeDriver();
	  }
	  else if(url.equals("firefox")) 
	  {
		     System.setProperty("webdriver.firefox.driver", "C://Drivers//geckodriver-v0.30.0-win64//geckodriver.exe");
			 driver = new FirefoxDriver();                       
	  }
		 
		 
		 driver.manage().window().maximize();
		 
		 {
		    driver.get("http://amazon.in");
		 }
		
  }

  
  @Test
  public void f()
  {
	 WebElement select = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
	 Select opt = new Select(select);
	
	 
  }
  
  
  
  @AfterMethod
  public void afterMethod()
  {
	 driver.close();
  }

}
