/*
Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Input:
Enter Number : 45

Output:
Number : 45
Result : Odd Number
*/
import java.util.*;
public class EvenOddNumApp{
	public static void main(String args[]){
		EvenOddNum n=new EvenOddNum();
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Number : ");
	    num=sc.nextInt();
		n.setValue();
		n.checkNum();
	}
      
}
class EvenOddNum{
	int num;
	void setValue(int x){
        num=x;		
		
	}
	void checkNum(){
		
		System.out.print("Enter Number : "+num);
		if(num%2==0){
			System.out.println("\nResult : Even Number");
		}else{
			System.out.println("\nResult : Odd Number");
		}
	}
}