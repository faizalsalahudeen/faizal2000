package faizal2;

public class average {
	// create a method
		  public int addNumbers(int a, int b) {
		    int sum = a + b;
		    int average = sum/2;
		    return average;
		  }
		  public static void main(String[] args) {
		   
		    int num1 = 25;
		    int num2 = 15;
		    // create an object of Main
		    average obj = new average();
		    // calling method
		    int result = obj.addNumbers(num1, num2);
		    System.out.println("Average is: " + result);
		  }
}
