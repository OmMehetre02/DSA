//47 Function to find LCM 

import java.util.*;
 public class Day03_Q47{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The first Value = ");
	   int a=sc.nextInt();
	    System.out.print("Enter The Second Value = ");
	   int b=sc.nextInt();
	        System.out.print(findLCM(a,b));
	  
    }
	public static int findLCM(int b,int a){
	    int max =(a>b)?a:b;
		while(true){
		if(max%a==0&&max%b==0){
		   return max;
		}
		max++;
	   }
	}
 }