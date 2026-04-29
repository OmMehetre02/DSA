/*
Q5. Write a function that accepts a number and prints its multiplication table up to 10.
Explanation
Use a loop from 1 to 10
Multiply number with loop variable
Print result inside function
*/
import java.util.*;
public class FeRecQ5{
	static int count=1;
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		Table(num);
	}
	public static void Table(int x){
		if(count<=10){
			System.out.println(count*x);
			count++;
			Table(x);
		}
		
		
	}
}