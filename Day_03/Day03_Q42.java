//42 Function to swap two numbers 

import java.util.*;
 public class Day03_Q42{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The a Value = ");
	   int num1=sc.nextInt();
	    System.out.print("Enter The b Value = ");
	   int num2=sc.nextInt();
	       swap(num1,num2);
	  
    }
	public static void swap(int a,int b){
		int temp=a;
		    a=b;
			b=temp;
			
			 System.out.print("After swaping\n");
			 System.out.print(" a ="+a);
			 System.out.print(" a ="+b);
	}
 }