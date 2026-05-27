//Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
import java.util.Scanner;
public class DivbyNumber{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		String res = n%5==0?"divisible by 5":n%11==0?"divisible by 11":"not";
		System.out.println("Check divisible by value=="+res);
	}
}