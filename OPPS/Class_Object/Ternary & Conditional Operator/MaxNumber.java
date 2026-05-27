//Q41. Write a java program to find a maximum between three numbers.
import java.util.Scanner;
public class MaxNumber{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int res = (x>y)?((x>z)?x:z):((y>z)?x:z);
		System.out.println("THIs is max value  = "+res);
		
		
	}
}