
//122 Recursive function for factorial

import java.util.*;

public class Day07_122 {

    // Recursive function
    int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Day07_122 obj = new Day07_122();

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        int result = obj.factorial(n);

        System.out.println("Factorial = " + result);
    }
}