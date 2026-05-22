/*5. Convert Lowercase to Uppercase (No LeetCode) 
Given a string containing lowercase letters, convert all characters into uppercase and return the 
updated string. 
Example: Input: "world" → Output: "WORLD"
*/
public class Day01_Q5{
	public static void main(String args[]){
		String s ="world";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='a'&&ch[i]<='z'){
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.print("Upper case =");
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
}