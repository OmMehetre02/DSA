/*
Q39. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
*/


public class PatternQ39{
	public static void main (String[]args){
		
		int num =5;
		
		for(int i=1;i<=5;i++){
			boolean b=true;
			for(int j=1;j<=5;j++){
				if(j<=6-i){
				if(b){
					System.out.print(num+"  ");
					    b=false;
					}else{
						System.out.print("* ");
						b =true;
					}
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			num--;
		}
	}
}
