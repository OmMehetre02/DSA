//Q19. Write a Java program that reads a number and displays the cube.
import java.util.Scanner;
public class Calculatecube{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");//number == a
		int a = sc.nextInt();
		int cube = a*a*a;
		System.out.println("Calculate cube ::==="+cube);
	}
}
