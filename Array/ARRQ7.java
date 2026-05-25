/*
Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/
import java.util.Scanner;
public class ARRQ7{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter The Array Elements =");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("reverse Array elements =");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}