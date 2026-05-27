/*
Q67. Write a java program to print this pattern.

	        A	B	C	D	E
	          A	  B	  C   D
		        A	B	C
		          A   B
			        A
*/

public class PatternQ67{
	public static void main(String[]args){
		for(int i=1;i<=5;i++){
			char ch = 'A';
			boolean b= true;
			for(int j=1;j<=9;j++){
				if(j>=i&&j<=10-i&&b){
					
					System.out.print(ch++);
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