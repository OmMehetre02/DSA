/*
Q49. Write a java program to print this pattern.

	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7
*/
public class PatternQ49{
	public static void main(String[]args){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if((j>=i&&j<=8-i)||(j<=i&&j>=8-i)){
					System.out.print(i+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
