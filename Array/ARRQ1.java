/*
Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
First, we take the size of the array from the user.
Then, elements are entered one by one into the array.
Finally, using a loop, we display all elements in the same order they were entered.
*/
import java.util.Scanner;
public class ARRQ1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size =");
		int size = sc.nextInt();
		int a[]=new int[size];
		
		int i;
		System.out.print("Array elements =");
		for( i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			
		}
		System.out.println("output :");
		for(i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		
		
	}

 }