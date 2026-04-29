import java.util.Scanner;
public class velocity{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter distance and time");
		double d = sc.nextDouble();	
		double t = sc.nextDouble();	
	   double velocity = d/t;
	  System.out.println("find the velocity, "+velocity);
	}
}