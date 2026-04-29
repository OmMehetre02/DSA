/*

Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type
*/
import java.util.*;
public class FuRecQ10{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		Fib(num);
		
	}
	public static void Fib(int n){
		int a=0,b=1;
		for(int i=0;i<=n;i++){
			System.out.print(a+" ");
		
		int temp=a+b;
		     a=b;
			 b=temp;
		}
	}
}