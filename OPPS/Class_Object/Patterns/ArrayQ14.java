/*Q14.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if an element already exists before adding to the result, thus avoiding duplicates.
*/
public class ArrayQ14{
	public static void main (String[]args){
		int a[]={10,20,20,30,40,40,50};
		int i =1;
		for (i=1;i<a.length;i++){
			if(a[i]!=a[i-1]){
				System.out.print(a[i-1]+" ");
			}
		}System.out.print(a[i-1]+" ");
	}
}