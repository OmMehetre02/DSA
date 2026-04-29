/*
Q36. Write a java program to print this pattern.
			
			1
	      1   2
	 	1	2	3
      1   2   3   4
	1	2	3	4	5
	
*/
public class PatternQ35{
	public static void main(String[]args){
		boolean b = true;
		for(int i=1;i<=5;i++){
			int num =1;
			for(int j=1;j<=9;j++){
				if(j>=6-i&&j<=4+i&&b){
					
					System.out.print(num);
					
					num++;
					b =false;
				
				}
				else{
					System.out.print(" ");
					 b=true;
				}
			}
			System.out.println();
			
		}
	}
}