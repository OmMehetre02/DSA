//Q1. Write a java program to print all natural numbers from 1 to n. using while loop
import java.util.*;
public class loopQ1{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner (System.in);
	   int num=sc.nextInt();
	   Natural(num);
   }
   public static void Natural(int n){
	   for(int i=1;i<=n;i++){
		  System.out.print(i+" ");
	   }
	  
   }
}