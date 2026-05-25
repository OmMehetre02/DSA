/*Q20. Write a Java program to print all elements from an integer array that are greater than a given number.

Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20

Output :- Elements greater than 20 :
    25 40
*/
import java.util.Scanner;
public class ARRQ20{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i =0;i<a.length;i++){
			 a[i]=sc.nextInt();
		}
		System.out.print(" Given Number: ");
		int num=sc.nextInt();
		System.out.print(" Elements greater than " +num+" :-");
		for(int i=0;i<a.length;i++){
			if(num<a[i]){
				System.out.print(a[i]+" ");
			}
		}
	}
}