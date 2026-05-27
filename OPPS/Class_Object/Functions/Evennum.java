//even number print
import java.util.*;
public class Evennum
{
   public static void main(String args[])
   {
	   System.out.print("Enter Nth number and print even number = ");
	Scanner sc = new Scanner (System.in);
	int num=sc.nextInt();
	 even(num);
   }
   
   public static void even(int num)
   {
	   for(int i=1;i<num;i++){
		   if(i%2==0)
		   System.out.println(i);
	   }
   }
}