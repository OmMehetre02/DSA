//35 Print odd index elements
import java.util.*;
public class Day02_Q35{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	    System.out.print("odd index elements is = ");
	   for(int i=0;i<a.length;i++){
		   
			   if(i%2!=0){
				 System.out.print(a[i]+" "); 
		      }
		   } 
	  
   }
}