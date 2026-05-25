/*
Q14.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
*/
import java.util.Scanner;
public class Array_14{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Unique elements =");
		for(int i=0;i<a.length;i++){
			//int count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					
					
					a[j]=-1;
				}
			}

		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			System.out.print(a[i]+" ");
		}
	}
}