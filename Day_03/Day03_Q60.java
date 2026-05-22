//60 Recursive sum of digits
import java.util.*;
 public class Day03_Q60{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The number = ");
	   int n=sc.nextInt();
	    System.out.print(digitsum(n));
	   
	  
    }
	public static int digitsum(int n){
		int sum=0;
	   if(n==0){
	     return 0;
		 
	   }else{
		   int digit=n%10;
		 sum=digit+digitsum(n/10);
	   }
	  return sum;
	   
      
	}
}