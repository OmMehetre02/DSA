/*
Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25
*/
import java.util.*;
public class FeRecQ4{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the 1st value = ");
		int num1=sc.nextInt();
		System.out.print("Enter the 2ed value =");
		int num2=sc.nextInt();
		Max(num1,num2);
		
	}
	public static void Max(int a,int b){
		if(a>b){
			System.out.print("Maximum number is = "+a);
		}else{
			System.out.print("Maximum number is = "+b);
		}
	}
}