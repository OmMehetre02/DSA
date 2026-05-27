
//46 Function to find GCD 

import java.util.*;
 public class Day03_Q46{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The first Value = ");
	   int a=sc.nextInt();
	    System.out.print("Enter The Second Value = ");
	   int b=sc.nextInt();
	        System.out.print(findGCD(a,b));
	  
    }
	public static int findGCD(int b,int a){
	    int gcd=1;
		for(int i=1;i<=a&&i<=b;i++){
		if(a%i==0&&b%i==0){
		     gcd=i;
		  }
		}
		return gcd;
	}
 }