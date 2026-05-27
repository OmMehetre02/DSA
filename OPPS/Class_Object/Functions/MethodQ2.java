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
public class MethodQ2{
	 
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number = ");
		int num= sc.nextInt();
		 EvenOddnum(num);
		 
		
	}
	static void  EvenOddnum(int x){
		if(x!=0){
		if(x%2==0)
		{
			System.out.print("number is even");
		}else
		{
			System.out.print("number is odd");
		}
		}else{
			System.out.print("invalid");
		}
	}
}