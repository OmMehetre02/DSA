 /*
Q4. Write a java program to display the reverse array. 
 
Input : Array = {1, 2, 3, 4, 5} 
Output : Reverse array = {5, 4, 3, 2, 1} 
Explanation : 
The last element becomes the first, and the first becomes the last by traversing from the end 
to the start.
*/
public class Q4{
	public static void main(String[]args){
		int a[]={5,8,4,1,4,5,8};
		System.out.print("display the reverse array. ");
		int start=0;
		int end=a.length-1;
		
		while(start<end){
			int temp= a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
			
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}
	}
}