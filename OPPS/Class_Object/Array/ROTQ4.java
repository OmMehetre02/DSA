/*

Q4. Write a program in java to rotate an array by N positions without using other array. 
  
 Input:  
 The given array is: 0  3  6  9  12  14  18  20  22  25  27 
 
 From 4th position the values of the array are: 12 14 18 20 22 25 27  
 Before 4th position the values of the array are: 0  3  6  9  
 After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9
 
 */
 public class ROTQ4{
	 public static void main(String []args){
		int a[]={0,3,6,12,14,18,20,22,25,27};
		System.out.print(" The given array is: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nFrom 4th position the values of the array are:");
		int pos=4;
		for(int i=pos;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n Before 4th position the values of the array are: ");
		for(int i=0;i<pos;i++){
			System.out.print(a[i]+" ");
		}

		for(int i=0;i<pos;i++){
			int temp = a[0];
			for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.print(" \nAfter rotating from 4th position the array is:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	 }
 }