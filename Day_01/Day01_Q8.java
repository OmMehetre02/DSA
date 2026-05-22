/*
8. Remove Spaces from String (LC 1592 Inspired) 
Given a string containing spaces, remove all spaces and return the updated string without 
changing the order of remaining characters. 
Example: Input: "a b c d" → Output: "abcd" 
*/

public class Day01_Q8{
	public static void main(String args[]){
		String s ="a b c d";
		
		String ans="";
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' '){
		    ans=ans+s.charAt(i);
		}
			
		}
		for(int i=0;i<ans.length();i++){
		System.out.print(ans.charAt(i));
		}
	}
}