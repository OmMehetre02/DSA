/*
Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function
*/
import java.util.*;
public class FeRecQ6{
	static int sumofdigit=0,productofdigit=1;
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		special(num);
		if(sumofdigit+productofdigit==num){
			System.out.print("it is special number");
		}else{
			System.out.print("it is not  special number");
		}
		
	}
	public static void special(int x){
	   if(x!=0){
		   int digit=x%10;
		   sumofdigit=sumofdigit+digit;
		   productofdigit=productofdigit*digit;
		  x=x/10;
		  special(x);
	   }
	}
}