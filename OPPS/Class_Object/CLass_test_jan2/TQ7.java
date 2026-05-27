/*
Q7. Write a java program to take input array from user and perform operations in array. 
Input Array :  5732  8659  2534  9625  7354  1325 
Output :-  17  28  14  22  19  11
*/
import java.util.Scanner;
public class TQ7{
   public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			int sum=0;
			while(a[i]!=0){
				int digit = a[i]%10;
				sum=sum+digit;
				a[i]=a[i]/10;
				
			}
			a[i]=sum;
			
		}
		
           for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
  }
}