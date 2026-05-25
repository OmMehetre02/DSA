/*
Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
	
Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/
public class ARRQ26{
	public static void main(String[]args){
		int a[]={1,5,7,-1,5};
		int sum=6;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[i]+a[j]!=sum){
					System.out.print(a[i]);
				}
			}
		}
	}
}