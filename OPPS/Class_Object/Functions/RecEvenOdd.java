/*
Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd
*/
import java.util.*;
public class RecEvenOdd{
	
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		EvenOddcheck(num);
	}
	public static void EvenOddcheck(int num){
		if(num%2==0){
			System.out.print("number is even");
		}else{
			System.out.print("number is odd");
		}
	}
}