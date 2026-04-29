/*
Q25. Write a java program to print this pattern.

	*	*	*	*	*	*	*	*	*
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*

*/

public class PatternQ25{
	public static void main(String[]args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if((j<=6-i||j>=4+i)||(j>=14-i||j<=i-4)){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}