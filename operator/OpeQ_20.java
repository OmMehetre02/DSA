/*
Q20. Write a Java program and compute the sum of an integer's digits.
Input : 123
Output : 6
*/

import java.util.Scanner;
public class OpeQ_20{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int res = 0;
		while(num>0) {
			int lastD=num%10;
			res+=lastD;
			nu m/=10;
		}
	          
		
		System.out.println(res);
	}
}