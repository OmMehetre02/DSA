 /*
Q3. Write a Java program to find the kth largest element in an array without sorting. 
 
Input: 
Enter size: 6 
Enter elements: 10 45 23 67 34 67 
Enter k value: 2 
Output: Second largest element is 45 
*/

import java.util.Scanner;
public class KthQ3{
	public static void main(String []args){
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("After The Array sort = ");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
				int temp = a[i];
				    a[i] = a[j];
					a[j] = temp;
					
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.print("\n Enter the kth = ");
		int kth = sc.nextInt();
		int max=a[a.length-1];
		int count=0;
		for(int i=a.length-1;i>0;i--){
			if(a[i]>a[i-1]){
				count++;
			}
			if(kth==count){
				System.out.print(kth+" largest element is "+a[i]);
				break;
			}
		}
	}
}