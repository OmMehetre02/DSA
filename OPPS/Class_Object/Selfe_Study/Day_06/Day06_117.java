//117 Find union of arrays 

import java.util.*;


public class Day06_117{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The 1st Array size  = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	    System.out.print(" Enter The 1st Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	    System.out.print("Enter The 2nd Array size  = ");
	   int size2=sc.nextInt();
	   int b[]=new int [size2];
	   System.out.print(" Enter The 2nd Array Eleents = ");
	   for(int i=0;i<b.length;i++){
	      b[i]=sc.nextInt();
		  
	   }
	      
	   System.out.print("union of arrays is = ");
	  for(int i=0;i<a.length;i++){
		  boolean found=false;
		  for(int j=0;j<i;j++){
			  if(a[i]==a[j]){
				  found=true;
				  break;
			  }
		  }
		  if(found==false){
			  System.out.print(a[i]+" ");
		  }
	  }
	  //inside b;
	  for(int i=0;i<b.length;i++){
		  boolean found=false;
		  for(int j=0;j<a.length;j++){
			  if(b[i]==a[j]){
				  found=true;
				  break;
				  
			  }
			  
		  }
		  for(int j=0;j<i;j++){
			  if(b[i]==b[j]){
				  found=true;
			  }
		  }
		  if(found==false){
			  System.out.print(b[i]+" ");
		  }
	  }
	  
	
	
		 
		 
	   
   }
}