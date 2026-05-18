//53 Recursive sum of natural numbers
import java.util.*;
 public class Day03_Q53{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	     System.out.print(naturalAdd(num));
	   
	  
    }
	public static int naturalAdd(int n){
	   if(n==0){
	     return 0;
	   }
	   return n+naturalAdd(n-1);
      
	}
}