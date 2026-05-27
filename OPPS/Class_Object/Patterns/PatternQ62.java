/*
Q62. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I
*/

public class PatternQ62{
	public static void main(String[]args) {
				
		for(int i=1;i<=5;i++){
			char ch =(char)('a'+i-1);
		
			for(int j=1; j<=5;j++){

				System.out.print(ch++);
			}
			
			System.out.println();
			
		}
		
		
	}
}