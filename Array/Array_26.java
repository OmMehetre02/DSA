/*
Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/

import java.util.Scanner;
public class Array_26{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size");
		int size=sc.nextInt();
		int a[]=new int [size];
		int i;
		System.out.println ("Enter The Array Elements");
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		
		}
		System.out.print("Output:- [");
		for(i=0;i<a.length;i++){
			if(a[i]%3==0){
				System.out.print("-1"+" ");
			}else{
				System.out.print(a[i]+" ");
				
			}
			System.out.print(",");
		}
		System.out.print("]");
	}
}