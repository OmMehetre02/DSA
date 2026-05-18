//31 Merge two arrays 
/*
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
import java.util.*;
public class Day02_Q31{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int nums1[]={1,2,3,0,0,0};
   int nums2[] = {2,5,6};
	  int m=3;
	  int n = 3;
	  int i=m-1;
	  int j=n-1;
	  int k=m+n-1;
	  while(i>=0&&j>=0){
		  if(nums1[i]>nums2[j]){
			  nums1[k]=nums1[i];
			  i--;
		  }else{
			  nums1[k]=nums2[j];
			  j--;
		  }
		  k--;
	  }
	  while(j>=0){
		  nums1[k]=nums2[j];
		  j--;
		  k--;
	  }
	    for(int a = 0; a < nums1.length; a++) {
            System.out.print(nums1[a] + " ");
		}
	  
	  }
}
	  