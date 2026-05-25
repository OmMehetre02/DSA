/*
Q23. Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Example :- The given array is: 4 8 4 6 7 4 4 8
       There are no Majority Elements in the given array
Explanation
Traverse the array using two loops.
For each element, count how many times it appears.
If the count of any element is greater than n/2, that element is the majority element.
If no such element is found after checking all elements, print that there is no majority element.
*/
import java.util.Scanner;
public class ARRQ23{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int n= a.length-1;
		boolean found=true;
		int i;
		for( i=0;i<a.length-1;i++){
			int count =0;
			for(int j=i+1;j<a.length-1;j++){
			if(a[i]==a[j]){
				count++;
				
			}
			}
			 if(n/2>count){
				  System.out.println("There are  Majority Elements in the given array...Is"+a[i]);
				  found=true;
				  break;
		}
		     
			  }
			  if(found==false){
			  System.out.println("There are no Majority Elements in the given array...is = ");
			  
			  }

			  }
		
		
	}

