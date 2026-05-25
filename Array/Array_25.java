/*
Q10. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.
*/


import java.util.Scanner;
public class Array_25{
	public static void main (String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i;
		int num=0;
		System.out.println("Enter Array Elements");
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("output:- [");
		
		for(i=0;i<a.length;i++){
			if(num<a[i]){
					System.out.print(a[i]+" ");
			}else{
				System.out.print(num+" ");
			}
			
		}
		System.out.print("]");
	}
}