

//30 Copy array elements 


import java.util.*;
public class Day02_Q30{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  int b[]=new int[a.length];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  
	  //Copy array elements
	  System.out.print("Copy array = ");
	   for(int i=0;i<a.length;i++){
		  b[i]=a[i];
	  }
	   for(int i=0;i<b.length;i++){
		  System.out.print(b[i]+" ");
	  }
	  
   }
}
	  
	  