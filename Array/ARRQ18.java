/*
Q18. Write a Java program to check whether a given array is empty or not.

Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.

Input :- Array elements: { }
Output :- Array is empty
*/
import java.util.Scanner;
public class ARRQ18{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
       
			if(a.length==0){
				System.out.print("Array is Empty......");
			}else{
				System.out.print("Array Is Not Empty.......");
			}
		
		
	}
}