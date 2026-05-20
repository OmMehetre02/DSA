//40 Move zeros to end

import java.util.*;
public class Day02_Q40{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  
	  int j=0;
	 
	  for(int i=0;i<a.length;i++){
		   if(a[i]!=0){
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			   j++;
		   }
		  }
	     for(int i=0;i<a.length;i++){
		   System.out.print(a[i]+" ");
		 }
		  
	   
	  
	 
   }
}
	   