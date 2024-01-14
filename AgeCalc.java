package Task11;

import java.util.Scanner;

public class AgeCalc {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter your age - ");
	            int age = scanner.nextInt();
	            
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be atleast 18");
	            } else {
	                System.out.println("Age is valid");
	            }
	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter a valid age.");
	        } finally {
	            scanner.close();
	        }
	    }
	}

/*

Output:

Enter your age - 22
Age is valid


Enter your age - 11
Age must be atleast 18


*/
