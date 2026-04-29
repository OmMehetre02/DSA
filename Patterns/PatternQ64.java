/*

Q64. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A
*/
public class PatternQ64{
	public static void main (String []args){
		char ch = 'F';
		for(int i=1;i<=5;i++){
			--ch;
			
			for(int j=1;j<=5;j++){
				if(j<=6-i){
					System.out.print(ch+" ");
				}
			}
			System.out.println();
		}
	}
}