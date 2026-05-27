/*
Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/
import java.util.Scanner;
public class Array_6{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Size");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter The Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Element to search =");
		int x = sc.nextInt();
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				System.out.print("Element"+x+"Found at index"+i);
			}
		}
	}
}