package suiteA;

import org.testng.annotations.Test;

public class TestA1 {
  @Test
  public void testA1() throws Exception
  {
	  System.out.println("Inside A1");
	  
	  Thread.sleep(3000);
	  
	  System.out.println("Ending A1");
  }
}
