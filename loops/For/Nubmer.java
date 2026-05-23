// write a java program print 0 to ...n number 
import java.util.Scanner;
public class Number{
	public static void main (String [] args ){
		Scannner sc = new Scanner (System.in);
		System.out.println("Enter the n number ");
		int n = sc.nextInt();
		int i;
		for (i=0; i<51;i++){
			System.out.println(i+1);
		}
		
	}
}