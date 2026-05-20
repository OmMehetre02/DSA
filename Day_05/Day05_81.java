//81 String compression LC 443 

import java.util.Scanner;
public class Day05_81{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	     String str=sc.next();
		 
		 char []ch=str.toCharArray();
		 int index=0;
		 
		 for(int i=0;i<ch.length-1;i++){
			 int count=1;
			 while(i<ch.length-1&&ch[i]==ch[i+1]){
				 count++;
				 i++;
			 }
			 ch[index++]=ch[i];
			 
			 if(count>1){
				 String s=count+"";
				 for(int j=0;j<s.length();j++){
					 ch[index++]=s.charAt(j);
				 }
			 }
		 }
		 for(int i=0;i<index;i++){
			 System.out.print(ch[i]+" ");
		 }
		  System.out.println();
		   System.out.print("length"+index);
		 
		 
		 
   }
}