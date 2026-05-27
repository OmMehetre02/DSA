/*
Q21. Write a Java program to reverse a number without using loop.
Input a number: 123 
Reverse number: 321
 */
 
 
 import java.util.Scanner;
 public class rever_21{
 public static void main(String[]args){
	 	 int rev = 0;
	 
	 int num = 123;
	 int lastD = num%10;
	 rev = rev*10+lastD;
	 num = num/10;
	 
	 lastD = num%10;
	 rev = rev*10+lastD;
	 num = num/10;
	 
	lastD = num%10;
	rev = rev*10+lastD;
	 num = num/10;
	 
	 System.out.println(rev);
 
 }
 }
