/*-
Q8. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique element
*/


import java.util.Scanner;
public class Array_23{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array1 size");
	     int size1=sc.nextInt();
		 System.out.println("Enter The Array2 size");
	     int size2=sc.nextInt();
		int a[]=new int[size1];
		int b[]=new int[size2];
		int c[]=new int[6];
		int i;
		int j;
		System.out.println("Enter The Array1 Elements");
		for( i=0;i<a.length;i++){
			
			a[i]=sc.nextInt();
		}
		System.out.println("Enter The Array2 Elements");
			for( i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.print("Output :-");
		for(i=0;i<a.length;i++){
			for(j=i+1;j<b.length-1;j++){
			if(a[i]!=b[j]){
				
			}
			}
		}
		for(i=0;i<c.length-1;i++){
			c[i]=a[j];
			System.out.print(c[i]);
		}
	}
}
