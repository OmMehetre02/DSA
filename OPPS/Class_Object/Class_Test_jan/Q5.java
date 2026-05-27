/*Q5. Write a java program to remove duplicated values from arrays. 
 
Input : Array = {10, 20, 20, 30, 40, 40, 50} 
Output : Unique elements = {10, 20, 30, 40, 50} 
Explanation: 
Traverse the array, check if element already exists before adding to result, thus avoiding 
duplicates.
*/
public class Q5{
	public static void main(String[]args){
		int a[]={10,20,20,30,40,40,50};
		
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				System.out.print(a[i]+" " );
			}
			
		}
		System.out.print(a[a.length-1]);
		
		
	}
}