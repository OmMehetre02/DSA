/*
Q6. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/


import java.util.Scanner;
public class Array_21{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array size");
		int size =sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter The Array Elements :");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==0){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print(" arr = [");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}
		System.out.print("]");
	}
}