/*
4. To Lower Case (LC 709) 
Given a string containing uppercase letters, convert all characters into lowercase and return the 
modified string. 
Example: Input: "HELLO" → Output: "hello" 
*/
public class Day01_Q4{
	public static void main(String args[]){
		String s ="HELLO";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A'&&ch[i]<='Z'){
				ch[i]=(char)(ch[i]+32);
			}
		}
		System.out.print("Lower case =");
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
}