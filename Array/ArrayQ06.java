/*
Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/


public class ArrayQ06{
	public static void main(String []args){
		int Array[]={10,20,30,40,50};
		int element =30;
		for(int i=0;i<Array.length;i++){
			if(Array[i]==element){
				System.out.println("Element 30 found at index "+i);
				
			}
		}
	}
}
