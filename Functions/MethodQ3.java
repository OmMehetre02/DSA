/*
Q3. Write a Java method that accepts a number and returns its square.
Explanation
Square means number × number
The method calculates and returns the result
Method Signature - static int square(int n)
Input - n = 5
Output - Square = 25

*/

import java.util.*;
public class MethodQ3{
	
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		printnum(num);
		System.out.print(printnum(num));
		
	}
	  static int printnum(int n){
		  int square=n*n;
		  return square;
		  
	  } 
}