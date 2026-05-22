//29 Count even and odd numbers

import java.util.*;
public class Day02_Q29{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	    int evencount=0;
		int oddcount=0;
	   for(int i=0;i<a.length;i++){
		   
			   if(a[i]%2==0){
				 evencount++; 
		   }else{
		   oddcount++;
		   }
		   }
		       System.out.print("evencount"+evencount);
			   System.out.print("\noddcount"+oddcount);
		   
	   

	   
	  
   }
}