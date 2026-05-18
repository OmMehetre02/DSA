//25 Reverse an array 
import java.util.*;
public class Day02_Q25{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	   int left=0;
	   int right=a.length-1;
	   while(left<right){
		   int temp=a[left];
		   a[left]=a[right];
		   a[right]=temp;
		   left++;
		   right--;
	   }
	   for(int i=0;i<a.length;i++){
		   System.out.print(a[i]+" ");
	   }
   }
}