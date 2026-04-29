// Q1. Write a java program to check number is neon number or not. 
// Example : A neon number is a number where the sum of digits of the square of the number is 
// equal to the number.
import java.util.Scanner;
public class NeonQ1{
	public static void main(String []args){
		Scanner sc= new Scanner (System.in);
		System.out.print("check number is neon number or not.");
		int num=sc.nextInt();
		int temp=num;
		int square=temp*temp;
		int sum=0;
		while(temp>0){
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		if(sum==temp){
			System.out.print("is neon number");
		}else{
			System.out.print("is not neon number");
		}
	}
}