/*
Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/

import java.util.Scanner;
public class Array_7{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
		System.out.println("ENter THE Array Size .");
		int size=sc.nextInt();
		System.out.println("Enter The Array Elements");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Reverse array =");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
			  int temp=a[i];
			     a[i]=a[j];
				 a[j]=temp;
			}
			
		  }
		  System.out.print(a[i]+" ");
		}
	}
}