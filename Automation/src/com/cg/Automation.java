package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation
{

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div[3]/input")).sendKeys("PradeepKumar");
	        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div[6]/input")).sendKeys("Nayak");
	        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"exp-1\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("06-11--958521");
	}

	

}
