/*
Q42. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1
*/


public class PatternQ42{
public static void main(String[]args){
	
	int num=0;
	for(int i=1;i<=5;i++){
		
		for(int j=1;j<=5;j++){
			if(num==8){
				num=0;
			}
			System.out.print(++num+" ");
			
		}
		System.out.println();
	}
}
}