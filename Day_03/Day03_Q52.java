//52 Recursive Fibonacci
import java.util.*;
 public class Day03_Q52{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	   for(int i=0;i<=num;i++){
	   System.out.print(fib(i+" "));
	   }
	  
    }
	public static int fib(int n){
    if(n==0) return 0;
    if(n==1) return 1;

    return fib(n-1) + fib(n-2);
	}
}