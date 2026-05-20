//38 Swap alternate elements 
import java.util.*;
public class Day02_Q38{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[6];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  
	  
	  for(int i=0;i<a.length-1;i=i+2){
		     int temp=a[i];
			      a[i]=a[i+1];
				  a[i+1]=temp;
		  }
	   for(int i=0;i<a.length;i++){
		   System.out.print(a[i]+" ");
	   }
	  
	 
   }
}
	   