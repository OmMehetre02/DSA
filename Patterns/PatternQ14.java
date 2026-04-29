/*Q14. Write a java program to print this pattern.

			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******
*/

public class PatternQ14{
	public static void main (String[]args){
		for(int i=1;i<=13;i++){
			for(int j=1;j<=7;j++){
				if(j<=8-i||i>=6+j ){//8>=6+1 8>=6+2 8>=9
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}