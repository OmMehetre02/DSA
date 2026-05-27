/*
6. Find Length Without Built-in Function (No LeetCode) 
Given a string, determine its length without using any built-in length function. Traverse the 
string manually and count the characters. 
Example: Input: "coding" → Output: 6 
*/
public class Day01_Q6{
	public static void main(String args[]){
		String s ="coding";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			count++;
		}
		System.out.print("Count is = "+count);
		
	}
}