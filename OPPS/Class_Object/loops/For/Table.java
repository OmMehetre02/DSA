// print table
import java.util.Scanner;
public class Table{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the table number ");
		int n = sc.nextInt();
		int i;
		for (i = 0; i < 11;i++){
			System.out.println(i*n);
		}
	}
}