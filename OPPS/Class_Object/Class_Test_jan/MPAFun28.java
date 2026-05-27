//28.Write a program to print numbers 1 to n using recursion.

                                
import java.util.* ;
public class MPAFun28
{
     static int count =1;
     public static void main(String args [])
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.print("enter The Number = ");
	    int num=sc.nextInt();
		
		Printnum(num);
	 }
	 public static void Printnum(int n)
	 {   
           if(n!=0)
		   {
		    
			 System.out.print( count+" ");
			 count++;
			  Printnum(n-1);
		   }

         
		  
	   }
	 
}