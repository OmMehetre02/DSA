//111 Insertion sort
import java.util.*;


public class Day06_111{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	 
	   
	   System.out.print("Insertion sort = ");
	
	   for(int i=1;i<a.length;i++){
		   int temp=a[i];
		   for(int j=i-1;j>=0;j--){
			   if(a[j]>a[j+1]){
				   a[j+1]=a[j];
				   a[j]=temp;
			   }
		   }
	   }
		  for(int i=0;i<a.length;i++){
			   System.out.print(a[i]+" ");
		  }
		
   }
}