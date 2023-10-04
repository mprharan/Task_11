package task_11;

public class Question_5 {
	
	 public static void main(String[] args) {
	        // ArrayIndexOutOfBoundsException
	        try {
	            int[] arr = {1, 2, 3};
	            int element = arr[5]; // This will throw an exception
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // StringIndexOutOfBoundsException
	        try {
	            String str = "Hello";
	            char ch = str.charAt(10); // This will throw an exception
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

}
