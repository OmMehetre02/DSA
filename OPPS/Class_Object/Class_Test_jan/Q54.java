/*
Q54. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,  0, 1,  2,-1,-4]
                          0   1  2   3  4  5
Output: [[-1,-1,2],[-1,0,1]]

Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.  
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.//
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
*/
import java.util.*;
public class Q54
{
	public static void main(String[]args)
	{
		int a[]={-1,0,1,2,-1,-4};
		
		Arrays.sort(a);
		for(int i=0;i<a.length-2;i++)
		{
			if(i>0&&a[i]==a[i-1])
				continue;
			
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[i]+1&&a[j]==a[j-1])
					continue;
				
				for(int k=j+1;k<a.length;k++)
				{
					if(a[k]>a[j]+1&&a[k]==a[k-1])
						continue;
					
					
						if((a[i]+a[j]+a[k])==0){
							System.out.print(a[i]+" "+a[j]+" "+a[k]+"\n");
						
					}
					
				}
			}
		}
	}
}