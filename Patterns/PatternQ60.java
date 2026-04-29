/*
Q60. Write a java program to print this pattern.

	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C
	D	D	D	D	D
	E	E	E	E	E
*/
public class PatternQ60{
	public static void main(String[]args) {
				char ch =64;
		for(int i=1;i<=5;i++){
				ch++;
			for(int j=1; j<=5;j++){

				System.out.print(ch);
			}
			System.out.println();
		}
		
		
	}
}