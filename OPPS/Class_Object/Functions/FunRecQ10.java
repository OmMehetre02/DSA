/*
Q10. Write a recursive function to reverse a given number.
Explanation:
Take the last digit and place it in reverse order.
Continue recursion by removing the last digit.
Stop when the number becomes 0.
Example: Input: 123		 Output: 321
*/
import java.util.*;
public class FunRecQ10{
	static int rev=0;
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		reverse(num);
		System.out.print(rev);
		
	}
	public static void reverse(int x){
		if(x==0)return ;
		
		int digit=x%10;
		rev=rev*10+digit;
		
		reverse(x/10);
		
	}
}