package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TC_003 {
	 public static WebDriver driver;
  @Test(groups={"Sanity"})
  public void f() {
	  System.out.println("Inside TC__003");
  }
  @BeforeMethod(groups={"Sanity"})
  @Parameters("browser")
  public void beforeMethod(String url) throws InterruptedException {
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
		 driver.get("http://snapdeal.com");
		 Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
