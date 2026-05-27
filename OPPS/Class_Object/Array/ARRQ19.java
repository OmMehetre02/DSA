/*
Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.

Explanation
Traverse the array from the first element to the last.
Check each element:
If the element is negative, replace it with 0.
If the element is zero or positive, keep it as it is.
After completing the traversal, print the modified array.
Input :- Array = [5, -3, 7, -1, 0, -6, 4]

Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]
*/
import java.util.Scanner;
public class ARRQ19{
	public static  void main (String[]args){
		Scanner sc = new Scanner (System.in);
		int replace=0;
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("updated Array = ");
		int i;
		for( i=0;i<a.length;i++){
			if(a[i]>0){
				System.out.print(a[i]+" ");
			}else{
				System.out.print(replace+" ");
			}
		}
		
			
		
	}
}