//37 Find common elements in two arrays

import java.util.*;
public class Day02_Q37{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  int b[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  for(int i=0;i<a.length;i++){
		  b[i]=sc.nextInt();
	  }
	  
	  for(int i=0;i<a.length;i++){
		  for(int j=0;j<b.length;j++){
			  if(a[i]==b[j]){
				  System.out.print(a[i]+" ");
				  break;
			  }
		  }
	  }
	 
   }
}
	   