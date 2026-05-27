/*
Q15. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/
public class ArrayQ15{
	public static void main(String[]args)
	{
		
		int a[]={4,2,1,4,5};
		int b[]={3,4,1,6,7};
		int c[]= new int[a.length];
		int k=0;
		boolean f;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
		 {
			if(a[i]==b[j])
			{
				f= true;
				for(int m=0;m<k;m++)
				{
					if(a[i]==c[m])
					{
						f=false;
						
					}
				}
				if(f){
					c[k]=a[i];
					System.out.print(a[i]+" ");
					k++;
				}
				
				
				
			}
		 }
		
	}
}
}