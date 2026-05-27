/*Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]


Explanation:


10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/

import java.util.Scanner;
public class Array_28{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter The Array Elements");
		int i;
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Output:- [");
		for(i=0;i<a.length;i++){
			if(a[i]%5==0){
				System.out.print("5"+" ");
			}else{
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]");
	}
}