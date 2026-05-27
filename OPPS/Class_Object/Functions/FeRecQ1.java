/*
Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
Example
Input: 10, 20              Output: Sum = 30

*/
public class FeRecQ1{
	
	public static void main(String []args){
		Twonumsum(10,20);
	}
	public static void Twonumsum(int a,int b){
		int sum=a+b;
		System.out.print("two number sum is = "+sum);
	}
}