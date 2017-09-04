package junit_tests;

// a change in local workstation! 4.9.2017 15:11

public class Calculator {
	  public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
	     // sum -= Integer.valueOf(summand); // FAILING test line
	    return sum;
	  }
	  

}