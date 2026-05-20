//114 Kth largest element 

import java.util.*;


public class Day06_114{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	      Arrays.sort(a);
	   System.out.print("Enter the kth value = ");
	   int k=sc.nextInt();
	   System.out.print(k+"th largest element is = ");
	   int count=0;
	   for(int i=a.length-1;i>=0;i--){
	       count++;
		   if(count==k){
		      System.out.print(a[i]);
		   }
	   }
	  
	
	
		 
		 
	   
   }
}