//45 Function to calculate power 
import java.util.*;
 public class Day03_Q45{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The first Value = ");
	   int base=sc.nextInt();
	    System.out.print("Enter The Second Value = ");
	   int power=sc.nextInt();
	        System.out.print(findPower(base,power));
	  
    }
	public static int findPower(int b,int p){
	int ans=1;
		for(int i=1;i<=p;i++){
		   ans=ans*b;
		}
		return ans;
	}
 }