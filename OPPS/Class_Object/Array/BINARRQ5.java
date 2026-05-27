 /*
Q5. Write a java program to implement binary search from array. 
 
Input: 
Array: 10 20 30 40 50 60 
Search: 40 
Output: Element found at index 3
*/


public class BINARRQ5{
	public static void main(String []args){
		int a[]={10,20,30,40,50,60};
		int index=-1;
		int skey=50;
		int L=0;
		int R=a.length-1;
		while(L<R){
			int mid = L+(R-L)/2;
			if(a[mid]==skey){
				index=mid;
				break;
			}
			if(a[mid]<skey){
				L=mid+1;
			}else{
				R=mid-1;
			}
		}
		if(index!=-1){
			System.out.print("Element found at index "+index);
		}else{
			System.out.print("Not found");
		}
	}
}