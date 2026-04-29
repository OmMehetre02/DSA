/*

Q27. Write a java program to print this pattern.

	*
	*	*
	*	*	*
	*
	*	*
	*	*	*
*/
public class PatternQ27{
	public static void main(String[]args){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=3;j++){
				if(i<=3 && j<=i || i>3 && j<=i-3){
					System.out.print("*");
				}else{ 
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
