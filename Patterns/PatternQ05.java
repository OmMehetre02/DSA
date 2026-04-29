/*
Q5. Write a java program to print this pattern.

	       *****
           ****
           ***
           **
           *
*/
public class PatternQ05{
	public static void main(String[]arg){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=i){
					System.out.print("*");
				}else{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}