/*
Q48. Write a java program to merge of two given array.

Input :- First Array :- 1 2 3 4 5
             	 Second Array :-  6 7 8 9 10 

	Output :- 1 10 2 9 3 8 4 7 5 6
*/
public class Q48
{
	public static void main(String []args)
	{
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		int c[]=new int[a.length+b.length]; 
		
		int i=0;              // start of array a
		int j=b.length-1;     // end index (used for b)
		int k=0;              // index for new array c
		while(i<a.length&&j>=0)
		{
			c[k++]=a[i++];    // take from a (left side)
			c[k++]=b[j--];   // take from b (right side)
		}
		
	
		
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}