/*
3. Count Vowels and Consonants (No LeetCode) 
Given a string, count the total number of vowels and consonants present in it. Consider only 
alphabetic characters while performing the count. 
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3
*/
public class Day01_Q3{
	public static void main (String args[]){
		String s="apple";
		int vcount=0;
		int conCount=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vcount++;
			}else{
				conCount++;
			}
		}
		System.out.print("Vowels count is = "+vcount);
		System.out.print("\n Consonants count is = "+conCount);
	}

}