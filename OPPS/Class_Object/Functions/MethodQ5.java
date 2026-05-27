/*
Q5. Write a Java method that takes an integer and returns the count of digits in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4
*/
import java.util.*;
public class MethodQ5{
	public static void main(String args [] ){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number = ");
		int num=sc.nextInt();
		System.out.print(Digits(num));
	}
	static int Digits(int x){
		int count=0;
		while(x!=0){
			int digit=x%10;
			count++;
			x=x/10;
		}
		return count;
	}
}
