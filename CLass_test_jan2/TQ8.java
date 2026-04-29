/*
Q8. You are given a sorted integer array that may contain duplicate values. Your task is to 
remove all duplicate elements so that each number appears only once and print the total 
count of unique elements. 
Description: 
Use two pointers: 
• One pointer keeps track of unique elements position.  
• Another pointer scans the array. 
Whenever a new unique element is found, place it in the correct position.  
Input: 
arr = [1, 1, 2, 2, 3, 4, 4, 5] 
Output: 
Unique Elements: [1, 2, 3, 4, 5] 
Count = 5
*/
import java.util.Scanner;
public class TQ8{
   public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[a.length];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Unique Elements:  =");
		
		 
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				System.out.print(a[i]+" ");
			}
			

		}
			System.out.print(a[a.length-1]+" ");
  }
}