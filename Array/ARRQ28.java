/*
Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique
  // copy first array   // check second array  // print union
*/
public class ARRQ28{
public static void main(String[]args){
	int a[]={1,2,3,4};
	int b[]={2,3,4,5,6,7};
	int c[]=new int [a.length+b.length];
	int k=0;
	//copy Firat Array c
	for(int i=0;i<a.length;i++){
		c[k++]=a[i];
		//System.out.print(c[k]+" ");
	}
	// check second array
	
	for(int i=0;i<b.length;i++){
		boolean found=false;
		for(int j=0;j<k;j++){
			if(b[i]==c[j]){
				found = true;
				break;
				
			}
		}
		if(!found){
		c[k++]=b[i];
	}
	
	}
	System.out.print("Union Elements Following Array is = ");
	for(int i=0;i<k;i++){
		System.out.print(c[i]+" ");
	}
	
	
}
}
