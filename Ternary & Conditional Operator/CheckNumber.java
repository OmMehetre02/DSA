//Q34. Write a Java program to check whether a number is positive , negative or zero.  
    import java.util.Scanner;
	public class CheckNumber
	{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String res = n>0?"Positive":n<0?"negative":"zero";
		System.out.println("check number:="+res);
	}
	}