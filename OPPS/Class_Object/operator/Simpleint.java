/*Q12. Write a java program to calculate the simple interest. 
       SI=(P*R*T)/100
         principal   = p
  rate of interest   = R
          year       = T */
import java.util.Scanner;
public class Simpleint{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P value");
		double P = sc.nextDouble();
		System.out.println("Enter R value");
		double R = sc.nextDouble();
		System.out.println("Enter T value");
		double T = sc.nextDouble();
		double SI = (P*R*T)/100;
		System.out.println("calculate the simple interest"+SI);
	}
}