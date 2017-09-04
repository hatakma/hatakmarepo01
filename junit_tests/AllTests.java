package junit_tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// http://www.vogella.com/tutorials/JUnit/article.html

@RunWith(Suite.class)
@SuiteClasses({
        CalculatorTest.class,
       MySecondClassTest.class 
  })

public class AllTests {
	  @BeforeClass 
	  static public void startClass() {
			 System.out.println("++++++++Starting test clasess in AllTests -class:"); 	  
			 System.out.println(" \n"); 	  
	  }
	  @AfterClass 
	  static public void afterClass() {
			 System.out.println("\n "); 	  
			 System.out.println("+++++++++All tests in Alltests -class tests are done"); 	  
	  }
}
