//33 Remove duplicate elements 

import java.util.*;
public class Day02_Q33{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	 
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  //remove duplicate
	  
	  for(int i=0;i<a.length;i++){
		  boolean b=false;
		  for(int j=0;j<i;j++){
			  if(a[i]==a[j]){
				  b=true;
				  break;
				  
			  }
		  }
		   if(b==false){
		  
		  System.out.print(a[i]+" ");
		  
	  }
	  }
	 
	  
	  
	  
	  
   }
}
	  
	  