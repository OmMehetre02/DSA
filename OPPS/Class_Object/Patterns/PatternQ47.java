/*
Q47. Write a java program to print this pattern.

					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1
*/
public class PatternQ47{
	public static void main(String[]args){
		boolean b=true;
		for(int i=1;i<=9;i++){
			int num =1;
			
			
			for(int j=1;j<=9;j++){
				if(j==6)
				--num;
				if((j>=6-i&&j<=4+i)&&(j<=14-i&&j>=i-4)&&b){
					System.out.print(num++);
					b=false;
				}else{
					System.out.print(" ");
					
					b=true;
				}
			}
			System.out.println();
		}
	}
}
