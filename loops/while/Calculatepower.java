// Q.3
//WAP input base and index value from keyboard and calculate power of number.

import java.util.Scanner;
public class Calculatepower
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base ");
		int base =sc.nextInt();
		System.out.println("Enter the index ");
		int index =sc.nextInt();
		int power=1;
	    while(index>0)// base 4 index 3  3>0 true 2>0 1>0 true 0>0 false
		{
			power=power *base; // 1*4 =4 power=4*4=16 power=16*4=64
			index--;// 2 1 0
		}	
		System.out.println("result is "+power);
	}
}