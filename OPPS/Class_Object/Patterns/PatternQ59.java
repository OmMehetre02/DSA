/*
Q59. Write a java program to print this pattern.

1        							1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1

*/

public class PatternQ59{
	public static void main(String[]args){
		for(int i=1;i<=5;i++){
			int num=1;
			for(int j=1;j<=10;j++){
				
				if(j<=i||j>=11-i){
					
					if(j<=i){
						System.out.print(num);
						num++;
					}
					else if(j>=11-i){
					System.out.print(--num);
						
						
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}