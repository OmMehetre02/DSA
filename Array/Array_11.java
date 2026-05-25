/*

Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
import java.util.Scanner;
public class Array_11{
	public static void main(String[]args)
	{
		System.out.println("Enter The Array Size");
		Scanner sc = new Scanner (System.in);
		int size=sc.nextInt();
		int a[]=new int [size];
		int largest=0;
		int secondLargest=0;
		int thirdLargest=0;
		int forth=0;
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();//12, 35, 1, 10, 34, 1
		}
		for(int i=0;i<a.length;i++){
			if(largest<a[i]){
				forth=thirdLargest;
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=a[i];
			
			}
			else if(a[i]>secondLargest  && a[i]!=largest)
			{	
				forth=thirdLargest;
				thirdLargest=secondLargest;
				secondLargest=a[i];
			}
			else if(a[i]>thirdLargest && a[i]!=secondLargest && a[i]!=largest)
			{
				forth=thirdLargest;
				thirdLargest=a[i];
			}
			else if(a[i]>forth && a[i]!=thirdLargest && a[i]!=secondLargest && a[i]!=largest)
			{
				forth=a[i];
			}
		}
		System.out.print("secondLargest"+forth);
		
	}
}