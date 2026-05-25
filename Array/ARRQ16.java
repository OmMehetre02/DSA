/*
Q16.Write a Java program to calculate the average of all elements present in an integer array.
Explanation
The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements​
First, iterate through the array and add all elements to a variable sum.
Then divide sum by the total number of elements (array.length) to get the average.
Input Array:
 [10, 20, 30, 40, 50]
Output:
 Average of array elements = 30
*/
import java.util.Scanner;
public class ARRQ16{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.print("Enter The array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
			System.out.print("Average of array elements = ");
			int sum=0;
			int avr=0;
			for(int i=0;i<a.length;i++){
				sum=sum+a[i];
				  avr=sum/a.length; 
				
			}
			
			System.out.print(avr+" ");
		} 
}