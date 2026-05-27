//105 Pair with given sum;




import java.util.*;


public class Day06_104{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	    System.out.print("Enter the target = ");
		int k=sc.nextInt();
	   
	   System.out.print("sum of pair = ");
	
	   for(int i=0;i<a.length-1;i++){
	     for(int j=i+1;j<a.length;j++){
		       if(a[i]+a[j]==k)
		     System.out.print(a[i]+","+a[j]);
		  }
		 }
		 
		 
		 
   }
}