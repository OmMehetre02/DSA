
/*
258. Add Digits
Easy
Topics
premium lock icon
Companies
Hint
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it
*/
public class Leet258{
public static void main(String []args){
	int num = 41;
	int  result=0; 
	while(num>=10){
		
		while(num > 0){
	int digit=num%10;
	 result=result+digit;
	    num=num/10;
	}
	    num = result;
	}
	System.out.print(result);
	
	

  }
}