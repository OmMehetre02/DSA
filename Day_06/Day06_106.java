//106 Triplet with given sum


import java.util.*;


public class Day06_106{
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
	   
	   System.out.print("Triplet are = ");
	
	   for(int i=0;i<a.length-2;i++){
	     for(int j=i+1;j<a.length;j++){
		     for(int k=j+1;k<a.length;k++){
		       if(a[i]+a[j]+a[k]==0){
		     System.out.print("["+a[i]+","+a[j]+","+a[k]+"]");
			   }
			
		    }
		 }
		 
		 
	   }
   }
}