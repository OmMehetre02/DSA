/*Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
Both arrays have the same length
Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
            Array2 = {10, 20, 30, 40}

Output :- Arrays are equal.
Explanation
First, check if the lengths of both arrays are equal
If lengths are different → arrays are not equal
If lengths are same, compare elements one by one using a loop
If any element mismatch is found → arrays are not equal
If all elements match → arrays are equal
*/
import java.util.Scanner;
     public  class ARRQ22{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Array Size1 = ");
		int size1=sc.nextInt();
		System.out.print("Enter The Array Size2 = ");
		int size2=sc.nextInt();
		int a[] = new int[size1];
		int b[] = new int[size2];
		System.out.print("Enter The 1st Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		