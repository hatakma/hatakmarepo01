package junit_tests;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MySecondClassTest {
	  static int nTest=0;
	  
	  @BeforeClass 
	  static public void startClass() {
			 System.out.println("====================================================="); 	  
			 System.out.println("(startClass) starting MySecondClassTest -class  tests"); 	  
			 System.out.println("======================================================\n"); 	  
	  }

	  @AfterClass 
	  static public void afterClass() {
				 System.out.println("==================================================="); 	  
				 System.out.println("(afterClass) Tests of MySecondClassTest -class  done"); 	  
				 System.out.println("===================================================\n"); 	  
	   }
	  
	  @Before
	  public void start() {
		  nTest++;
		 System.out.println("-------------------------------------------------------------"); 
		 System.out.println("(start) MySecondClassTest -class test: " + nTest + "  started"); 
		 
	  }
	  @After
	  public void after() {
		 System.out.println("(after) MySecondClassTest -class test: " + nTest + " completed"); 
		 System.out.println("-------------------------------------------------------------\r\n"); 
	  }
	  
	  @Test
	  public void dummyTestMSC() {
	    System.out.println("  method:  dummyTestMSC");	  
	    // int sum=4;
	    int sum=6;
	    assertEquals(6, sum);
	  }	 
	  
	  // @Test(expected = IllegalArgumentException.class)
	  @Test
	  public void testExceptionIsThrown() {
	    System.out.println("  method:  testExceptionIsThrown");		  
	    MyClass tester = new MyClass();
	    tester.multiply(1000, 5); // exception > 999
	    // tester.multiply(998, 5);	    
	  }
	  
	  @Test
	  public void testMultiply() {
	    System.out.println("  method:  testMultiply");			  
	    MyClass tester = new MyClass();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }  
	 	  
	  
}
