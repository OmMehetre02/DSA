/*
Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function
*/
import java.util.*;
public class FuRecQ8{
	 static   int count =0;
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Base num = ");
		int num=sc.nextInt();
		System.out.print("Enter The power of num =");
		int power = sc.nextInt();
		
		Calpower(num,power);
	}
	public static void Calpower(int n,int m){
	       int res=1;
		   for(int i=1;i<=m;i++){
			   res=res*n;
		   }
		   System.out.print("powerof number is = "+res);
		   
		   
	}
}