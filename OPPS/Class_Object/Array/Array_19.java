/*
Q4. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2

*/
import java.util.Scanner;
public class Array_19{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter The Array Element");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<a.length;i++){
			int prev = a[i-1];
			int next = a[i];
			int k = prev + 1;
			while(k<next){
				System.out.print(k + " ");
				k++;
			}
			
		}
		/*System.out.println("result array");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}*/
			
		
		
		
	}
}