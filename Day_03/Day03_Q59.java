//59 Recursive decimal to binary
import java.util.*;
 public class Day03_Q59{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The number = ");
	   int n=sc.nextInt();
	    decimalToBinary(n);
	   
	  
    }
	public static void decimalToBinary(int n){
	   if(n==0){
	     return;
	   }
	   decimalToBinary(n/2);
	   System.out.print(n%2);
      
	}
}