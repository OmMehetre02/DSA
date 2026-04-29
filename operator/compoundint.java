/*Q13. Write a java program to calculate the compound interest.
     principal      = p
  rate of interest   = R
          year       = T 
		  Compound Interest (CI) = A – P
Where,
A = 𝑃×(1+𝑅/100)^T
		  */
		  
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
		        double A = P * Math.pow((1 + R / 100), T);  // Amount
        double CI = A - P;  // Compound Interest

        System.out.println("Compound Interest = " + CI);
        System.out.println("Total Amount = " + A);
}}
