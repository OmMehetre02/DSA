
//102 Rotate array right LC 189 



import java.util.Scanner;


public class Day06_102{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	   System.out.print("Enter the value rotate array =");
	   int k=sc.nextInt();
	   for(int i=0;i<k;i++){
	     int last=a[a.length-1];
		 for(int j=a.length-1;j>0;j--){
		    a[j]=a[j-1];
		 }
		 a[0]=last;
	   }
		
		
		for(int i=0;i<a.length;i++){
		  System.out.print(a[i]+" ");
		}		 
		 
		 
   }
}