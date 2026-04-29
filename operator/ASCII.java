//Q16. Write a Java program to print the ASCII value of a given character.
import java.util.Scanner;
public class ASCII{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		System.out.println("ASCII = " +(int)ch);
		
	}
}