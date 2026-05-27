//58 Recursive GCD 
import java.util.*;
 public class Day03_Q58{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The first number = ");
	   int a=sc.nextInt();
	    System.out.print("Enter The second number  = ");
	   int b=sc.nextInt();
	     System.out.print(gcd(a,b));
	   
	  
    }
	public static int gcd(int a,int b){
	   if(b==0){
	     return a;
	   }
	   return gcd(b,a%b);
      
	}
}