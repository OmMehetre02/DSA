/*
Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30
*/
import java.util.*;
public class MethodQ1{
     public static void main (String [] args){
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter 1st value = ");
		 int a = sc.nextInt();
		 		 System.out.print("Enter 2ed value = ");
		 int b = sc.nextInt();
		
		int result= getSum(a,b);
		 System.out.print("sum = "+result);
	 }
	 static int getSum(int x,int y){
		 int sum = x+y;
		 return sum;
	 }
}