//44 Function to calculate factorial
import java.util.*;
 public class Day03_Q44{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	   
	  System.out.print(fact(num));
	  
    }
	public static int fact(int n){
	int fac=1;
	   for(int i=1;i<=n;i++){
	   fac=fac*i;
	   }
	   return fac;
	}
 }