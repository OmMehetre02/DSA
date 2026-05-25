/*Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/

public class ARRPR_16{
	public static void main(String []args){
		int count=1;
		int a[]={1,1,1,3,3,3,4};
		int i=0;
		for(i=0;i<a.length-1;i++){
			
			if(a[i]==a[i+1]){
				++count;
			}
			
			else{
							System.out.println(a[i]+"->"+count);
                   count=1;	
			}
		}
	if(a[a.length-1] == a[i])  {
									System.out.println(a[i]+"->"+count);

	}

		
	}
}