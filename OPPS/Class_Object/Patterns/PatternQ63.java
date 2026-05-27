/*
Q63. Write a java program to print this pattern.

	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E
*/
 public class PatternQ63{
	 public static void main(String[]args){
		char ch = '@';
		 for(int i=1;i<=5;i++){
			  ch++;
			 for(int j=1;j<=5;j++){
				 if(j<=i){
					 System.out.print(ch);
				 }
			 }
			 System.out.println();
			 
			 
		 }
	 }
 }
