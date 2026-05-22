 //41 Function to add two numbers
 import java.util.*;
 public class Day03_Q41{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The First Value = ");
	   int num1=sc.nextInt();
	    System.out.print("Enter The Second Value = ");
	   int num2=sc.nextInt();
	  int result=add(num1,num2);
	  System.out.print("sum = "+result);
    }
	public static int add(int a,int b){
		int sum=a+b;
		return sum;
	}
 }