//WAP to input number and calculate its factorial?


import java.util.Scanner;
public class Calculatefactorial{
	public static void main (String[]args){
		/*
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		*/
		
		int fact=5;
		int res=1;
		while(fact>0){
			res=res*fact;
			System.out.println(fact);
			fact--;
		}
			
	}
}