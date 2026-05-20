//43 Function to check prime number
import java.util.*;
 public class Day03_Q43{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	   
	       isPrime(num);
	  
    }
	public static void isPrime(int n){
	   int count=0;
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		       count++;	
			}
		}
		if(count==2){
		    System.out.print(true);
		 }
		 else{
		     System.out.print(false);
		 }
	}
 }