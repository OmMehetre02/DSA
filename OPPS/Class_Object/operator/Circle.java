//Q 5. Write a java program to enter the radius of a circle and find its diameter,area and circumference.
//Formula :-
//diameter=2 * radius;
//circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;
import java.util.Scanner;
public class circle{
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter circle of radius");
	double radius = sc.nextDouble();
	double diameter = 2 * radius;
	System.out.println(" circle diameter,"+diameter);
	double circumference = 2*3.14*radius;
    System.out.println(" circle circumference,"+circumference);
	double area = 3.14*radius*radius;
	System.out.println(" circle area,"+area);
	
}
}