/*
Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/
import java.util.Scanner;
public class ArrayQ17
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("ENter Array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
		{
			 a[i]=sc.nextInt();
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int count =1;
		int i;
		for(i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				count++;
			}
			else
			{
				if(count > size/2)
				System.out.prirntln("majority element is " + a[i-1]+" count is = "+count);
				count=1;
			}
		}
		if(count > size/2)
		System.out.println("majority element is "+ a[i-1]+" count is = "+count);
	   else
	   {
		System.out.println("____There are no Majority Elements in the given array.________");
	    }
		
	}
}