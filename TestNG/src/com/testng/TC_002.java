package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TC_002 {
	
 public static WebDriver driver;

 @BeforeMethod(groups={"regression"})
 @Parameters("browser")
 public void beforeMethod(String url) throws Exception
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
			 driver.get("http://flipkart.in");
			 Thread.sleep(2000);
 }

  @Test(groups={"regression"})
  public void f()
  {
	  System.out.println("Inside TC__002");
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
