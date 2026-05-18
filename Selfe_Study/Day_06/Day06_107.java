//107 Maximum subarray sum
import java.util.*;
public class Day06_107{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	    int maxSum=a[0];
		int currentSum=0;
	   for(int i=0;i<a.length;i++){
	     currentSum+=a[i];
		 if(currentSum>maxSum){
			 maxSum=currentSum;
		 }
		 if(currentSum<0){
			 currentSum=0;
		 }
		 
	   }
	   System.out.print("maxSum = "+maxSum);
   }
}