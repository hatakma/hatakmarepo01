package junit_tests;

public class MyClass {

    public int multiply(int i, int j) {
        if (i > 999) {
            throw new IllegalArgumentException("i should be less than 1000");
          }   	
    	System.out.println(i + " * " + j + "= " + i*j);  
    	return i *j;
    }
}
