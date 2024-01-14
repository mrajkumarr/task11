package Task11;
import java.util.Scanner;

public class DivisionException {
	

	    public static void main(String[] args) {
	    	
	    	// creating scanner class to get input from user
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("enter the first number ");
	        int num1 = scanner.nextInt();

	        System.out.print("enter the second number ");
	        int num2 = scanner.nextInt();

	        try  
	        { //Perform division
	            int result = num1 / num2;
	            System.out.println("result: " + result);
	        } 
	        catch (ArithmeticException e) 
	        { 
	        	
	               	 // Handle exception when number is zero	        	
	            System.out.println("division by zero is not allowed");
	        }
	    }
	}


/*

Output:

enter the first number 10
enter the second number 2
result: 5

enter the first number 1
enter the second number 0
division by zero is not allowed


*/