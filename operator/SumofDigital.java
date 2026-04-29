//Q20. Write a Java program and compute the sum of an integer's digits.
import java.util.Scanner;
    public class SumofDigital{
       public static void main (String[]args){
      	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n = sc.nextInt();
	    int sum = 0;
        int tempNumber = n; // Use a temporary variable to avoid modifying the original number

        // Loop to extract and sum digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            tempNumber /= 10; // Remove the last digit
        }

        System.out.println("The sum of the digits of " + n + " is: " + sum);

          
	
	
	
}
}