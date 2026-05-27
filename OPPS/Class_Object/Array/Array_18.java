/*
Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/
import java.util.Scanner;
public class Array_18{
public static void main(String[]args)
    {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter The Array Size");
	int size=sc.nextInt();
	int a[]=new int[size];
	int i;
	System.out.println("ENter The Array Elements");
	for( i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		
	}System.out.print("The given array is:");
	for( i=0;i<a.length;i++){
	System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.print("Enter Array position:");
	int pos=sc.nextInt();
	System.out.println();
	System.out.print("From "+pos+"th position the values of the array are:");
for( i=0;i<pos;i++){
			int temp = a[0];//0
		   // System.out.print(temp+" ");
			
	 		for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];//
			}
			a[a.length-1]=temp; 
			
		}
		for( i=0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
		}	}
	
	}
	
	
    
  