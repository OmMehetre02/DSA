//Q32. Write a Java program to accept 3 angles of triangleand check whether a triangle is valid or not.
import java.util.Scanner;
public class Validtriangle{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three angle");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		String res = a>0&&b>0&&c>0&& a+b+c==180?"valid":"invalid";
		System.out.println(res);
	}
}
