//Q11. Write a java program to enter marks of five subjects and calculate total marks and percentage.
import java.util.Scanner;
public class percentage{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter marks of five subjects");
		double marathi  = sc.nextDouble();
		double math     = sc.nextDouble();
		double english  = sc.nextDouble();
		double science  = sc.nextDouble();
		double biology  = sc.nextDouble();
		System.out.println("calculate total marks and percentage,"+ (marathi+math+english+science+biology)/5);
	}
}