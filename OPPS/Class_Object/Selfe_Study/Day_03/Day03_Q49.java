//49 Function to print Fibonacci series 

import java.util.*;
 public class Day03_Q49{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	   
	   fib(num);
	  
    }
	public static void fib(int n){
	  int a=0;
	  int b=1;
	  System.out.print(a+" "+b+" ");
	  for(int i=3;i<=n;i++){
		  int c = a+b;
		  System.out.print(c+" ");
		  a=b;
		  b=c;
	  }
	  
	
 }
 }