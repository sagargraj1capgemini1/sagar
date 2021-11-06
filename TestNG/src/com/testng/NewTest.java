package com.testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1()
  {
	  System.out.println("I am  Test1 : " + Thread.currentThread().getId() );
  }
  @Test
  public void test2()
  {
	  System.out.println("I am Test2 :" + Thread.currentThread().getId());
  }
 
}
