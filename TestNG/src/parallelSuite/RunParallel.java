package parallelSuite;

import java.util.Arrays;

import org.testng.TestNG;

public class RunParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestNG obj=  new TestNG();
      obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
      obj.setSuiteThreadPoolSize(2);
      obj.run();
	}

}
