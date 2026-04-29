/*
Q69. Write a java program to print this pattern.

	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5
*/
public class PatternQ69{
	public static void main(String[]args){
		for(int i=1;i<=5;i++){
			char ch = 'A';
			int num=1;
			for(int j=1;j<=5;j++){
				if(j<=i){
					if(i%2==0){
					System.out.print(ch+++" ");
					
				}else{
					System.out.print(num+++" ");
					
				}
			}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}