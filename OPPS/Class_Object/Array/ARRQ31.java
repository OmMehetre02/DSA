
/*
Q31. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.

*/


public class ARRQ31{
	public static void main(String []args){
		int a[]={5,3,7,2};
		a[0] = 0;                     // first element
		a[a.length - 1] = 0;          // last element
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
		
	}
