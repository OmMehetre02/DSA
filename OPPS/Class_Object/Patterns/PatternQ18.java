/*
Q18. Write a java program to print this pattern.

					*
				*		*
			*				*
		*						*
	*	*	*	*	*	*	*	*	*
*/
public class  PatternQ18{
	public static void main(String[]args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==6-i||j==4+i||i==5){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}