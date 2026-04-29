//WAP to input number and calculate its factorial?


import java.util.Scanner;
public class Factorial {
	public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
	double fact = sc.neouble();
		double res=1;
		
		while(fact>0){
				res=res*fact;
			fact--;	
			
		}
		System.out.println(res);
	}
}