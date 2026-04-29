/*
Q5. Given an integer array and a specific element, write a Java program to find the index 
position of that element in the array. If the element is not found, print -1. 
 Input :- Array: {10, 20, 30, 40, 50} 
  Element to find: 30 
Output :- Element found at index: 2
*/
import java.util.Scanner;
public class TQ5{
   public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the Search key =");
		int skey = sc.nextInt();
		boolean b = true;
		for(int i=0;i<a.length;i++){
			if(a[i]==skey){
				System.out.print(" Element found at index: "+i);
			          
			}
		}

  }
}