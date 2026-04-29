/*Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
*/

public class ArrayQ01{
	public static void main (String []args){
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}