/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
*/


public class ArrayQ03{
	public static void main(String[]args){
		int[]a={11,20,33,42,55,60};
		for(int i=0;i<a.length;i++){
		if(a[i]%2==0){
		System.out.println(a[i]);
		}
		
		}
		System.out.println("Even Values");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd Values");
	}
}