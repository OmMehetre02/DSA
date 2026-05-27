//Q1.  Write a java program to check if a number is a happy number or not. 

import java.util.Scanner;
public class TQ1{
     public static void main(String args []){
		 Scanner sc = new Scanner (System.in);
		 int num= sc.nextInt();
            
			if(num<10){
				num=num*num;
			}
	         int sum =0;
			 int temp=num;
		    while(temp>9)
			{
				
				while(temp>0)
				{
					int digit = temp%10;
			
					sum=sum+(digit*digit);
			 
					temp=temp/10;
				}
				temp=sum;
				 sum=0;
			   
		 }
		  
		 
              
		 
		 if(temp==1)
		 {
			 System.out.print("it is happy number");
		 }else{
			 System.out.print("not happy");
		 }
		 
		 
	 }
}