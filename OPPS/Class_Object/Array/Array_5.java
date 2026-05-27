/*
Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.


For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.
*/
import java.util.Scanner;
public class Array_5{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Array Size");
		int size = sc.nextInt();
		int a[]=new int[size];
		int evenCount = 0;
		int oddCount = a.length;
		System.out.println("Enter The Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Count of Even Values =");
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
					evenCount++;
				}
				
			
		}
		
		System.out.println(evenCount);
		System.out.print("Count of Odd Values =");
		System.out.println(oddCount-evenCount);
	}
}