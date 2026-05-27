//110 Selection sort
import java.util.*;


public class Day06_110{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	 
	   
	   System.out.print("Bubble sort = ");
	
	   for(int i=0;i<a.length-1;i++){
	     for(int j=0;j<a.length-1-i;j++){
		     if(a[j]>a[j+1]){
				 int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
			   
			
		    }
		 }
		  for(int i=0;i<a.length;i++){
			   System.out.print(a[i]+" ");
		  }
		
   }
}