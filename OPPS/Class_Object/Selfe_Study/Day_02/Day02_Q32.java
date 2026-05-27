//32 Find second largest element
import java.util.*;
public class Day02_Q32{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	 
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  
	  int largest=Integer.MIN_VALUE;
	  int secondLargest=Integer.MIN_VALUE;
	   for(int i=0;i<a.length;i++){
		    if(a[i]>largest){
			  secondLargest=largest;
			  largest=a[i];
			}else if(a[i]>secondLargest&&largest!=secondLargest){
			   secondLargest=a[i];
			}
	  }
	  System.out.print("secondLargest = "+secondLargest);
	  
   }
}
	  
	  