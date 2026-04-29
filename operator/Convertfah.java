//Q8. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
//Formula :- fah = (cel * 9 / 5) + 32;

import java.util.Scanner;
public class Convertfah{
	public static void main(String[]ards){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Celsius");
		double cel = sc.nextDouble();
		double fah = (cel * 9 / 5) + 32;
		System.out.println("length converted to Fahrenheit.,"+fah);
		
	}
}