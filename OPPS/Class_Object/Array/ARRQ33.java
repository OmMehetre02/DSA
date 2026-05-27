/*
Q33. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/
public class ARRQ33{
	public static void main(String[]args){
		int a[]={1,2,3,2,1};
		int first=0;
		int last=a.length-1;
		boolean b=true;
		for(int i=0;i<a.length;i++){
		
			
				if(a[first]!=a[last]){//
					 b=false;
				    break;
				}
					first++;
			         last--;
					
				if(first>=last){
					break;
				}
				
				}
				if(b){
					System.out.print("is a palindrome.");
				}else{
					System.out.print("is not a palindrome.");
				}
			}
			
			
		}
	

