//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.
    // a, e, i, o, u
	import java.util.Scanner;
	public class CheckVowelorConsonant{
		public static void main (String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the alphabet");
			char ch = sc.next().charAt(0);
			String res =   ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'? "Vowel":"Consonant";
             System.out.println(res);
		}
	}