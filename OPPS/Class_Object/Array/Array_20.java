/*
Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]
*/
import java.util.Scanner;
public class Array_20{
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Array Size");
	int size = sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter The Array Elements");
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	System.out.print("Ascending Order: [");
	int temp;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]+" ");
	}
	System.out.print("]");
		System.out.println();
		System.out.print("Descending Order:[");
		for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]+" ");
		
	}
	System.out.print("]");
	}
}
