/*
Q14.  Write a java program to remove duplicated values from arrays.

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.Scanner;
public class ARRQ14{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter The Array Size = ");
		int size=sc.nextInt();

		int a[]=new int[size];

		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}

		System.out.print("Unique elements = ");

		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				System.out.print(a[i]+" ");
			}
		}

		System.out.print(a[a.length-1]); // print last element
	}
}