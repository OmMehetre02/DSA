/*
Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5
*/

import java.util.*;
public class FeRecQ3{
	
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		printnum(num);
		
	}
	  static void printnum(int n){
		  for(int i=1;i<=n;i++){
			 
            System.out.print(i+" ");
		  }
		  
	  } 
}