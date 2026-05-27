/*
Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/
import java.util.Scanner;
public class Array_8
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array Size");
         int size=sc.nextInt();
		 int a[]=new int [size];
		 System.out.println("Enter The Array Elements");
		 for(int i=0;i<a.length;i++){
			 a[i]=sc.nextInt();
		 }
		 System.out.print("Missing elements =");
		 int miss=a[0];
		 for(int i=0;i<a.length;i++){
			if(a[i]<miss){
				miss=a[i];
			}
				System.out.print(miss); 
			 
		 }
		
		
	}
}