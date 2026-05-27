/*
Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/
import java.util.Scanner;
public class Array_16
{
	
	public static void main(String []args){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("In Following Array Are repeating =");
		int count =0;
		for(int i=0;i<a.length;i++){
			  
				   if(a[i]==count){
					   System.out.print(count);
				   }else{
					   count++;
				   }
			   
			
		}
	}
}