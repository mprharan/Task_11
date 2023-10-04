package task_11;

import java.util.Scanner;

public class Question_6 {
	
	 public static void main(String[] args) {
	        // Assume the correct password is "password123"
	        String correctPassword = "password123";

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your password: ");
	        String enteredPassword = scanner.nextLine();

	        try {
	            if (!enteredPassword.equals(correctPassword)) {
	                throw new IncorrectPasswordException("Incorrect password entered.");
	            }
	            System.out.println("Login successful!");
	        } catch (IncorrectPasswordException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }

}
