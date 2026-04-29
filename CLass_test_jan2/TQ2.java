//Q2. Write a Java program to find all abundant numbers up to n.

import java.util.Scanner;
public class TQ2{
     public static void main(String args []){
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter The number = ");
		 int n=sc.nextInt();
		 
		System.out.print("abundant numbers up to n.");
		 for(int i=1;i<n;i++){
			 
			  int sum=0;
			 for(int j=1;j<i;j++){
				 if(i%j==0){
				 sum=sum+j;
			 }
			 }
			 if(sum>i){
			 System.out.print(i+" ");
			 }
		 }
		 
	}
}