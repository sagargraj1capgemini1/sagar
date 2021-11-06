package suiteA;

import org.testng.annotations.Test;

public class TestA2 {
  @Test
  public void testA2() throws Exception 
  {
      System.out.println("Inside A2");
	  
	  Thread.sleep(3000);
	  
	  System.out.println("Ending A2");
  }
}
