//54 Recursive power calculation
import java.util.*;
 public class Day03_Q54{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The number of base = ");
	   int b=sc.nextInt();
	    System.out.print("Enter The number of power = ");
	   int p=sc.nextInt();
	     System.out.print(numPower(b,p));
	   
	  
    }
	public static int numPower(int b,int p){
	   if(p==0){
	     return 1;
	   }
	   return b*numPower(b,p-1);
      
	}
}