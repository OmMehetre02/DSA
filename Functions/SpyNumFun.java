/* Q6. Write a java program to Check If a Number Is a Spy Number or Not spy number using function 
recursion.  */

import java.util.*;
public class SpyNumFun{
	static int sum=0;
	static int product=1;
	public static void main (String args []){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		spy(num);
		if(sum==product){
			System.out.print("It is spy number ..............");
		}else{
			System.out.print("It is Not spy number ..............");
		}
	}
	public static void spy(int x){
		if(x!=0){
			int digit = x%10;
			sum = sum+digit;
			product=product*digit;
			spy(x/10);
			
		}
	}
}