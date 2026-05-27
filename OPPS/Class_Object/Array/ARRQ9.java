/*
Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.
*/
import java.util.Scanner ;
public class ARRQ9{
	public static void main (String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Arrsy Size = ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[]=new int[a.length];
		System.out.print("Enter the Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Copy The Array = ")
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}
}