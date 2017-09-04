package junit_tests;

import static org.junit.Assert.assertEquals;

// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;
import org.junit.*;

public class CalculatorTest {

	static  int nTest=0;
 
  @BeforeClass 
  static public void startClass() {
			 System.out.println("==================================================="); 	  
			 System.out.println("(startClass) starting CalculatorTest -class  tests"); 	  
			 System.out.println("===================================================\n"); 	  
   }
  @AfterClass 
  static public void afterClass() {
			 System.out.println("==================================================="); 	  
			 System.out.println("(afterClass) Tests of CalculatorTest -class  done"); 	  
			 System.out.println("===================================================\n"); 	  
   }	  
  @Before
  public void start() {
	  nTest++;
	 System.out.println("---------------------------------------------------------"); 
	 System.out.println("(start) CalculatorTest -class test: " + nTest + " started"); 
	 
  }
  @After
  public void after() {
	 System.out.println("(after) CalculatorTest -class test: " + nTest + " completed"); 
	 System.out.println("-----------------------------------------------------\r\n"); 
  }
  
  @Test
  public void evaluatesExpression() {
    System.out.println("   Method:  evaluatesExpression");	  
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }

  @Test
  public void dummyTest() {
    System.out.println("  Method:  dummyTest");	  
    int sum=4;
    assertEquals(6, sum);
  }
  


  
}