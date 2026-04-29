//Q31. Write a Java program to check whether a number is even or odd. 
import java.util.Scanner;
public class Evenorodd{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		  String res = num%2==0?num+" is even" : num +" is odd";
        System.out.println(res );
        //by using less variables
      //  System.out.println(num%2==0?num + " is even" : num + " num is odd");

		
	}
}