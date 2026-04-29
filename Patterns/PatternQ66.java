/*
Q66. Write a java program to print this pattern.

			A
	      A   B
		A	B	C
	  A	  B	  C	  D
	A	B	C	D	E
*/

public class PatternQ66{
 public static void main(String[]args){
	 for(int i=1;i<=5;i++){
		 char ch ='A';
		 boolean b=true;
		 for(int j=1;j<=9;j++){
			 if(j>=6-i&&j<=4+i&&b){
				 System.out.print(ch++);
				 b=false;
			 }else{
				 System.out.print(" ");
				  b=true;
			 }
		 }
		 System.out.println();
	 }
 }
 }