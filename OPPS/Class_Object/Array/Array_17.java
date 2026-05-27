/*Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/


import java.util.Scanner;
public class Array_17{
	public static void main(String []args){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int n=a.length;
		
		int i;
		System.out.println("Enter Array Elements");
		for( i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for( i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(a[j]==a[i]){
					count++;
					
				}                         
			}
			
			
		}System.out.print(count);
		
	
}
}