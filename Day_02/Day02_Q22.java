//22 Find minimum element
import java.util.*;
public class Day02_Q22{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	   int min=Integer.MAX_VALUE;
	   for(int i=0;i<a.length;i++){
		 if(min>a[i]){
			 min=a[i];
		 }
	   }
	   System.out.print("minimum numBer is = "+min);
   }
}