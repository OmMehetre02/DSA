//Question7:Copy elements from one array to another

import java.util.Scanner;
public class Arr7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int i;
		System.out.println("Enter The Array Elements");
		for( i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Copy elements The Given Array :");
		
		for( i=0;i<a.length;i++){
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		
	} 
}