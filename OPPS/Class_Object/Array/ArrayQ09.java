/*
Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.
*/
import java.util.Scanner;
public class ArrayQ09{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter array size:");
		int size = sc.nextInt();
		int[]a1=new int [size];
		int[]a2=new int [size];
		System.out.print("ENter"+size+"ELements :");
		for ( i=0;i<size;i++){
			a1[i]=sc.nextInt();
				
		}for(int i=0;i<size;i++){
			a2[i]=a1[i];
		}
		System.out.print("Array2={");
		for(int i=0;i<size;i++){
			System.out.print(a2[i]);
			if(i!=size-1){
				System.out.print(",");
			}
		}
	System.out.print("}");
	}
}