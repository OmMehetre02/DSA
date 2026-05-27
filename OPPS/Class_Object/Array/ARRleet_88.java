/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
public class ARRleet_88{
	public static void main(String []args){
		int nums1[]={1,2,3 };
		int nums2[]={2,5,6 };
		int nums3[]=new int[nums1.length+nums2.length]; 
		for(int i=0,j=nums1.length;i<nums1.length;i++,j++){
			nums3[i]=nums1[i];
			nums3[j]=nums2[i];
		}
		for(int i=0;i<nums3.length;i++){
		System.out.print(nums3[i]);
		}
	}

}