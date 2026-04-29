/*
Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/

public class ArrayQ07{
	public static void main(String []args){
		System.out.print("Reverse array =");
		int Array[]={1,2,3,4,5};
		for(int i=Array.length-1;i>=0;i--){
			System.out.print(" "+Array[i]);
		}
	}
}