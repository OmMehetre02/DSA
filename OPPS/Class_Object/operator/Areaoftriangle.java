//Q10. Write a java program to calculate the area of an equilateral triangle.
import java.util.Scanner;
public class Areaoftriangle{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("equilateral triangle side");
		double side = sc.nextDouble();	
	   double area = (Math.sqrt(3) / 4) * side * side;
	  System.out.println("Area equilateral triangle, "+area);
	}
}