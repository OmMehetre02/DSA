/*
Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
public class Array_31{
public static void main(String[]args)
{
	int a[]={2,4,6,8};
	int b[]=new int[a.length];
	int res;
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i]*a[i];
	}
	for(int i=0;i<b.length;i++){
		System.out.print(b[i]+" ");
	}
}
}