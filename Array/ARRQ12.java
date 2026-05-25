/*
Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5
*/
import java.util.Scanner;
public class ARRQ12{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The ARRAY size = ");
		int size = sc.nextInt();
		int a[]=new int [size];
		System.out.print("Input" + size +" elements in the array in ascending order :");
		for(int i=0;i<a.length-1;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Displaying Array = ");
		for(int i=0;i<size;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Input the position where to insert :");
		
		int pos = sc.nextInt();
		System.out.print("Value :");
		int v =sc.nextInt();
		System.out.print("The new list is :");
		for(int i=a.length-1;i>pos;i--){
			a[i]=a[i-1];
			
		}
		a[pos]=v;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}