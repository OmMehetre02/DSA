//21 Find maximum element

import java.util.*;
public class Day02_Q21{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	   int max=0;
	   for(int i=0;i<a.length;i++){
		 if(max<a[i]){
			 max=a[i];
		 }
	   }
	   System.out.print("Max numBer is = "+max);
   }
}