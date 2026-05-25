/*
Q27. Write a java program to count the frequency of each element in a given array.
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
public class ARRQ27{
	public static void main(String []args){
		int a[]= {1,2,1,3,2,2};
		for(int i=0;i<a.length;i++){
			int count =1;
			boolean b=false;
			for(int k=0;k<i;k++){
			if(a[i]==a[k]){
				 b = true;
				 break;
			}
			}
			if(b){
				continue;
			}
			
			
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
					
				}
			}
			System.out.println(a[i]+"<-->"+count);
		}
	}
}