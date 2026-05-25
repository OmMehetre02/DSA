/*Q15. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/
public class ArrayPR_15{
	public static void main(String []args){
		int a1[]={1,2,3,4,5};
		int a2[]={3,4,5,6,7};
		System.out.print("common elements = {");
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i]==a2[j]){
					System.out.print(a1[i]+", ");
				}
				
			}
			
		}
		System.out.print("}");
	}
}