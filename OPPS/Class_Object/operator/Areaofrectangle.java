//Q4. Write a java program to enter the length and breadth of a rectangle and find its area.
//Formula - area= length * breadth;
import java.util.*;
public class Areaofrectangle{
public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	System.out.println(" Enter rectangle length");
	double length = sc.nextDouble();
	System.out.println(" Enter rectangle breadth");
	double breadth = sc.nextDouble();
	double area = length * breadth;
	
	System.out.println("Area of rectangle ="+area );


}

}