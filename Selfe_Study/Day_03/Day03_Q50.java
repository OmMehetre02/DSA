//50 Function returning largest of three numbers —
import java.util.*;
 public class Day03_Q50{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The first Value = ");
	   int a=sc.nextInt();
	    System.out.print("Enter The Second Value = ");
	   int b=sc.nextInt();
	     System.out.print("Enter The Third Value = ");
	   int c=sc.nextInt();
	     System.out.print("largest is = "+largest(a,b,c));
	  
    }
	public static int largest(int b,int a,int c){
	   if(a>=b&&a>=c){
	    return a;
	   }else if(b>=a&&b>=c){
	     return b;
	   }else{
	     return c;
	   }
	}
 }