/*
Q7. Write a recursive function to calculate the factorial of a given number.
Explanation:
Factorial of n is n * factorial(n-1).
Base condition: factorial of 0 or 1 is 1.


Example: Input: 5		Output: 120
*/
import java.util.*;
public class FunRecQ7{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num= sc.nextInt();
		System.out.print(Factsum(num));
	}
	public static int Factsum(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*Factsum(n-1);
		
	}
}