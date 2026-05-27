//Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene
import java.util.Scanner;
 public class Typeoftriangle{
	 public static void main(String[]args){
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter the angles ");
		     double a  = sc.nextDouble();
		     double b  = sc.nextDouble();
		     double c  = sc.nextDouble();
			 String res =(a + b > c && b + c > a && c + a > b) ?
                        (a == b && b == c ? "Equilateral Triangle" :
                        (a == b || b == c || a == c ? "Isosceles Triangle" : "Scalene Triangle"))
                      : "Not a valid triangle";
			 
			 System.out.println(res);
	 }
	 
 }
 