/*
Q35. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1

*/

public class PatternQ35{
	public static void main(String[]args){
	      
		for(int i=1;i<=5;i++){
			int num=5;
			
			for(int j=1;j<=5;j++){
				if(j>=i){
					System.out.print(num);
					num--;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}