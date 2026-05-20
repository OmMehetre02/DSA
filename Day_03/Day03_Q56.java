//56 Recursive palindrome check

import java.util.*;
 public class Day03_Q56{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The String = ");
	   String s=sc.nextLine();
	    
	     System.out.print(isPalindrome(s,0,s.length()-1));
	   
	  
    }
	public static boolean isPalindrome(String s,int left,int right){
		if(left>=right){
			return true;
		}
	   if(s.charAt(left)!=s.charAt(right)){
	       return false;
	   }
	   return isPalindrome(s,++left,--right);
      
	}
}