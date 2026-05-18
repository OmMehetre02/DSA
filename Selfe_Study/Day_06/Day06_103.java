//103 Find missing number





import java.util.*;


public class Day06_103{
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
	   System.out.print("missing number is = ");
	   int miss=-1;
	   for(int i=0;i<a.length;i++){
	      if(a[i]!=i+1){
		    miss=i+1;
			break;
		  }
		 }
		 
	    System.out.print(miss);
		
		
		 
		 
		 
   }
}