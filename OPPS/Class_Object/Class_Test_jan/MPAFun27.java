//27.Write a program to calculate power using recursion.
                                 
import java.util.* ;
public class MPAFun27
{
     
     public static void main(String args [])
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.print("enter The Number = ");
	    int num=sc.nextInt();
		 System.out.print("enter The Number of power = ");
		 int power = sc.nextInt();
		 int result=numofpower(num,power);
		 System.out.print("result = "+result);
	 }
	 public static int numofpower(int n,int p)
	 {   
           if(p==0)
		   {
		     return 1;
		   }
			  return n*numofpower(n,p-1);
			  
	   }
	 
}