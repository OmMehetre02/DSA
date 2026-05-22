//104 Find duplicate number LC 287 






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
	   Arrays.sort(a);
	   System.out.print("duplicate number is = ");
	
	   for(int i=0;i<a.length-1;i++){
	      if(a[i]==a[i+1]){
		     System.out.print(a[i]);
		  }
		 }
		 
	   
		
		
		 
		 
		 
   }
}