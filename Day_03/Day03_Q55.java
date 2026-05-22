//55 Recursive reverse string 
import java.util.*;
 public class Day03_Q55{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The String = ");
	   String s=sc.nextLine();
	    
	     System.out.print(reverse(s));
	   
	  
    }
	public static String reverse(String s){
	   if(s.length()==0){
	     return "";
	   }
	   return reverse(s.substring(1))+s.charAt(0);
      
	}
}