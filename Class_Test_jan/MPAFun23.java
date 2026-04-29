//📘 Recursion Programs
//23.Write a program to print factorial using recursion.

import java.util.* ;
public class MPAFun23
{
     public static void main(String args [])
	 {
		 Scanner sc = new Scanner (System.in);
	    int num=sc.nextInt();
		System.out.print(fact(num));
	 }
	 public static int fact(int n)
	 {  
	 if(n==0||n==1)
	 {
	     return 1;
	 }
	     return  n*fact(n-1);
	 }
	 
}



