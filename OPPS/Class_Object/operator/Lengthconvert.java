//Q6. Write a java program to enter length in centimeter and convert into meter and kilometer.
import java.util.Scanner;
public class lenthconvert{
	public static void main(String[]ards){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double length = sc.nextDouble();
		double meter = length*1/100;
		System.out.println("length converted to meter,"+meter);
		double kilometer = length*1/100000;
		System.out.println("length converted to kilometer,"+kilometer);
	}
}