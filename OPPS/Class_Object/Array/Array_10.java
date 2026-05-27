
/*
Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
	
	*/
	import java.util.Scanner;
	public class Array_10{
		public static void main(String []args){
			System.out.println("Enter The Array Size");
			Scanner sc = new Scanner(System.in);
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.print(" Elements in the array in ascending order :");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.print("Input the position where to delete :");
			int p=sc.nextInt();
			for(int i=p;i<a.length-1;i++){
			    a[i]=a[i+1];
					
				
			}
			System.out.print("The new list is :");
			for(int i=0;i<a.length-1;i++){
				System.out.print(a[i]+" ");
			}
		}
	}