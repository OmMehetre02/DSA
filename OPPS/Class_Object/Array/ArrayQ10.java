/*
Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5

*/
import java.util.Scanner;
public class  ArrayQ10{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Intput The Size of Array :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Input"+n+" elements in the array in ascending order :");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Input the position where to delete : ");
		int pos = sc.nextInt();
		for(int i=pos;i<n-1;i++){//position deleten
			arr[i]=arr[i+1];
		}
		System.out.print(" The new list is :");
		for(int i=0;i<n-1;i++){
		System.out.print(arr[i]+" ");
		}
		
	}
}