//Q36. Write a Java program to check whether a character is alphabetic or not.
import java.util.Scanner;
public class CheckAlphabet{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter is values");
		char ch =  sc.next().charAt(0);
		String res = (ch >= 'a'&& ch<='z')||(ch >='A'&&ch<='Z')?"Is alphabetic =":"Not alphabetic =";
		System.out.println(res);
	}
}