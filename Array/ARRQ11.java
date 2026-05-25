/*
Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
import java.util.Scanner;
public class ARRQ11{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int i;
		System.out.print("Enter The Array Elements = ");
		for( i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int largest=0;
		int secondLargest=0;
		
		System.out.print(" SecondLargest value is  = ");
		for( i=0;i<a.length;i++){
			if(largest<a[i]){
			   secondLargest=largest;
			   largest=a[i];
			  
			}else if (a[i]>secondLargest&&a[i]!=largest){
					secondLargest=a[i];
				}
			  
			
			
			 
		}	System.out.print(secondLargest);
		}
      }
