
/*
Q61. Write a java program to print this pattern.

	A	B	C	D	E
    A	B	C	D	E
    A	B	C	D	E	
    A	B	C	D	E
    A	B	C	D	E
*/public class PatternQ61{
	public static void main(String[]args) {
	
		for(int i=1;i<=5;i++){
				char ch =65;
			for(int j=1; j<=5;j++){
				
				System.out.print(ch++);
			}
			System.out.println();
		}
		
	}
}
