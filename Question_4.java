package task_11;

import java.util.Scanner;

public class Question_4 {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        try {
	            int result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }

	        scanner.close();
	    }

}
