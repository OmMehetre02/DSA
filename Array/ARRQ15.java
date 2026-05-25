/*
Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/
import java.util.Scanner;
public class ARRQ15{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size = sc.nextInt();
		System.out.print("Enter the 1st Array = ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			
		}
		System.out.print("Enter the 2ed Array = ");
		int b[]=new int[size];

		for(int j=0;j<a.length;j++){
			b[j]=sc.nextInt();
			
		}
		System.out.print("Common elements = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==b[j]){
					System.out.print(a[i]+" ");
				}
				
			}
		}
	}
}




