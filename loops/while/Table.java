//WAP to input number from keyboard and print its table? 
import java.util.Scanner;
public class Table{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int i=0;
		System.out.println("Enter the print table");
		while( i<10){
			++i;
			System.out.println( i*n);
		}
			
	}
}