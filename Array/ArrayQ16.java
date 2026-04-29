/*
Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/
import java.util.Scanner;
public class ArrayQ16{
	public static void main(String[]args){
		Scanner sc =new Scanner (System.in);
		System.out.println("ENter Array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter element");
		for(int i=0;i<size;i++){
			 a[i]=sc.nextInt();
		
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Element with frequency");
		int count =1;
		int i;
		for(i=1;i<a.length;i++){
			if(a[i]==a[i-1]){
				count++;
			}
			else
			{
				System.out.println(a[i-1]+" count is = "+count);
				count=1;
			}
		}
		System.out.println(a[i-1]+" count is = "+count);
		
	}
}