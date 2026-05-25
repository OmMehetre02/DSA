/*
Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
*/

import java.util.Scanner;
public class ARRQ5{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array size =");
		int size= sc.nextInt();
		int a[]=new int [size];
		System.out.print("Enter The Array Elements ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("output");
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++ ){
			if(a[i]%2==0){
				evencount++;
			}else{
				oddcount++;
			}
		}
		System.out.print("Count of Even Values ="+evencount);
		System.out.println();
		System.out.print("Count of Even Values ="+oddcount);
	}
}