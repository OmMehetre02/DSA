/*
Q4. Write a method that takes two integers and returns the greater number.
Explanation
Compare both numbers
Return the larger one
Method Signature - static int findMax(int a, int b)

Input - a = 12, b = 20
Output - Maximum = 20
*/
import java.util.*;
public class MethodQ4{
  public static void main(String args []){
	  Scanner sc = new Scanner (System.in);
	  System.out.print("Enter the 1st value = ");
	  int a= sc.nextInt();
	  System.out.print("Enter the 2ed value = ");
	  int b=sc.nextInt();
	 System.out.print("this value is Maximum = " +Maximum(a,b));
  }
  static int Maximum(int x,int y){
	  if(x>y)return x;
	  else return y;
  }
}