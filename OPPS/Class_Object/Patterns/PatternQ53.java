/*
Q53.  Write a java program to print this pattern.

	1	2	3	4	5
	6			7
	8		9
	10	11
	12
*/
public class PatternQ53{
	public static void main (String[]args){
		int num=1;
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				if(j==1||i==1||j==6-i){
					System.out.print(num+++"\t");
				}
			else {
				System.out.print("\t");
			   }
			}
			System.out.println();
		}
	}
}