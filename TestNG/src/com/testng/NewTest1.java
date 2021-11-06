package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test(priority = 1 , enabled= false )
  public void z()
  {
	  System.out.println("Inside z");
  }
  @Test(priority = 3)
  public void c()
  {
	  System.out.println("Inside c");
  }
  @Test(priority = 4)
  public void g()
  {
	  System.out.println("Inside g");
  }
  @Test(priority = 2)
  public void b()
  {
	  System.out.println("Inside b");
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Inside Suite ");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Inside  Method");
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Inside  Class");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Inside  Test");
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Inside AfterMethod ");
  }

 

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Inside AfterClass");
  }

  

  @AfterTest
  public void afterTest()
  {
	  System.out.println("Inside AfterTest");
  }

  

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Inside AfterSuite");
  }

}
