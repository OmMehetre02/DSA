//Q9. Write a java program to enter two angles of a triangle and find the third angle. 
import java.util.Scanner;
public class Findangle{
	public static void main (String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two angles ");
		double angle1 = sc.nextDouble();
		double angle2 = sc.nextDouble();
		double angle3= 180-angle1+angle2;
		System.out.println("The third angle is , "+angle3);
	}
}
