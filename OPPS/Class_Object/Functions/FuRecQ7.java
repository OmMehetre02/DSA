/*
Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value
*/

import java.util.*;
public class FuRecQ7{
	static int count =1;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		fact(num);
	}
	public static void fact(int n){
		if(count<=n){
			
			if(n%count==0){
				System.out.print(count+" ");
			}		
			count++;
			fact(n);
			
		}
        
	}


}