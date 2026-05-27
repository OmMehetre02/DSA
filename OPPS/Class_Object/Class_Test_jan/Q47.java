/* 
Q47. Write a java program to merge of two given array.

	Input :- First Array :- 1 2 3 4 5
             	 Second Array :-  6 7 8 9 10 

	Output :- 1 2 3 4 5 6 7 8 9 10
	
*/

public class Q47{
	public static void main(String[]args){
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		int c[]=new int [a.length+b.length];
		
		for(int i=0,j=a.length;i<a.length;i++,j++){
			
			c[i]=a[i];
			c[j]=b[i];
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
}