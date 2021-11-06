package com.dependency;

import org.testng.annotations.Test;

public class DependencyDemo {
  @Test(priority=1)
  public void orange()
  {
	  System.out.println("Inside Orange");
  }
  @Test(priority=2,dependsOnMethods = {"orange"})
  public void white()
  {
	   System.out.println("Inside White");
  }
  @Test(priority=3 ,dependsOnMethods = {"white"})
  public void blue()
  {
	  System.out.println("Inside Blue");
  }
  @Test(priority=4,dependsOnMethods = {"blue"})
  public void green()
  {
	  System.out.println("Inside Green ");
  }
 
  
}

