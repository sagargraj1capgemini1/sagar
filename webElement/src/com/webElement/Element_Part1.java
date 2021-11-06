package com.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Element_Part1 extends Base{

	public static void main(String[] args) 
	{
			  
		   System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
           driver.get("http://goo.gl/RVdKM9");
           driver.manage().window().maximize();
           driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Bharath");
           driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Kumar H K ");
           driver.findElement(By.id("RESULT_TextField-3")).sendKeys("90088665541");
           driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
           driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Mandya");
           driver.findElement(By.id("RESULT_TextField-6")).sendKeys("BharathKumar@gmail.com");
          
           /* 
            *  Many Operation we can do in DropDown
            *  1) How many Options are There
            *  2)Extract all and print them 
            *  3)Select Options from the DropDown
            */
           
           WebElement drp = driver.findElement(By.id("RESULT_RadioButton-9"));
           Select opt = new Select(drp);
           System.out.println("Number of options Present in DropDown" + " "+ opt.getOptions().size());
           
           
           List <WebElement> list = opt.getOptions();
           
           for(WebElement a : list) {
        	   System.out.println( a.getText());
        	   System.out.println(a.getTagName());
           }
           
            opt.selectByIndex(2);
           //driver.findElement(By.id("RESULT_RadioButton-7_1")).click();
            driver.findElement(By.linkText("Software Testing Tutorials")).click();
            
            driver.navigate().back();
              
            driver.close();
	}

}
