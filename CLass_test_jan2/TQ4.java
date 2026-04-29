//Q4. Write a java program to find the frequency of each digit in a given number.

import java.util.Scanner;
public class TQ4{
     public static void main(String args []){
		 Scanner sc = new Scanner (System.in);
		 int num= sc.nextInt();
		 int count=0;
	
		 while(num!=0){
			 int freq=0;
			 int digit = num%10;
			 freq=freq+digit;
			  if(digit==freq){
				  count++;
			  }
			  System.out.println(digit+"--"+count+"\n");
			  num=num/10;
		 }
	 }
}