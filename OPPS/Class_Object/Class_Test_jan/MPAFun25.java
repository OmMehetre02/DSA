//25.Write a program to print table using recursion.
import java.util.* ;
public class MPAFun25
{
     static int count=1;
     public static void main(String args [])
	 {
		 Scanner sc = new Scanner (System.in);
	    int num=sc.nextInt();
		   table(num);
	 }
	 public static void table(int n)
	 {  
            if(count<=10)
			{
			   System.out.println(count*n);
			   count++;
			   table(n);
			}
			
	 }
	 
}
