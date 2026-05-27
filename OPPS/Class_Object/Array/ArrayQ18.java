/*
Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/
public class ArrayQ18{
	public static void main (String []args){
		int a[]= {0,3,6,9,12,15,18,21,24,27};
		int n=4;
		System.out.print("this is given array = {"); 
		
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}
		System.out.print("}");
		System.out.println();
		
		for(int i=0;i<n;i++){
			int temp = a[0];//0
		   // System.out.print(temp+" ");
			
	 		for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];//
			}
			a[a.length-1]=temp; 
			
		}
		for(int i=0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
		}
		
		
	}
}
