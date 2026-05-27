/*
7. Number of Segments in a String (LC 434) 
Given a sentence, count the total number of words or segments separated by spaces. 
Consecutive spaces should not be counted as extra words. 
Example: Input: "I love programming" → Output: 3
*/

public class Day01_Q7{
	public static void main(String args[]){
		String s ="I love programming";
		
		int count=0;
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' ')){
			count++;
		}
			
		}
		System.out.print("Count is = "+count);
		
	}
}