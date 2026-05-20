 
//51 Recursive factorial 

import java.util.*;
 public class Day03_Q51{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	   
	   System.out.print(fact(num));
	  
    }
	public static int fact(int n){
	  if(n==0||n==1){
	     return 1;
	  }
	  return n*fact(n-1);
	
 }
 }