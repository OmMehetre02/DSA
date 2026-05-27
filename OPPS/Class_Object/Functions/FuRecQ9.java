/*
Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function
*/
import java.util.*;
public class FuRecQ9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Strongnum(num);
	}
	public static void Strongnum(int n){
		int factsum=0;
		int original=n;
		while(n!=0){
			int digit=n%10;
			int fact = 1;
			for(int i=1;i<=digit;i++){
				  fact=fact*i;
				  }
				 factsum=factsum+fact;
			          n=n/10;
		}
			  if(original ==factsum){
				  System.out.print(" Number is a Strong Number.");
			  }else{
				   System.out.print(" Number is not  a Strong Number.");
			  
		}
	}
}