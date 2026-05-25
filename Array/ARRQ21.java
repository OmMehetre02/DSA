/*
Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array. If the element is not found, print -1.

Explanation
Traverse the array from index 0 to length - 1
Compare each element with the target element
If a match is found, return its index
If the loop ends and no match is found, return -1
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30

Output :- Element found at index: 2
*/
import java.util.Scanner;
public class ARRQ21{
	public static void main(String []args){
	Scanner sc =new Scanner (System.in);
	System.out.print("Enter The Array Size = ");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.print("Enter The Array Elements = ");
	for(int i=0; i<a.length;i++){
		a[i]=sc.nextInt();
	}
	System.out.print("Element to find:");
	int find = sc.nextInt();
	
	for(int i=0;i<a.length;i++){
		if(find==a[i]){
			System.out.print("Element found at index: "+i);
			
		}
	}
	}
}