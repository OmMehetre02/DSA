//26.Write a program to reverse number using recursion.
import java.util.* ;
    
public class MPAFun26
{       
      static int rev=0;
     public static void main(String args [])
	 {
		 Scanner sc = new Scanner (System.in);
	    int num=sc.nextInt();
		   reverse(num);
		   System.out.print("reverse"+rev);
	 }
	 public static void reverse(int n)
	 {  
            if(n!=0)
			{
			   int digit = n%10;
			   rev =rev*10+digit;
			   reverse(n/10);
			}
			  
			
	 }
	 
}
