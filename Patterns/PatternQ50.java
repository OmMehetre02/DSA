/*
Q50. Write a java program to print this pattern.

				1
			2	2
		3	3	3
	4	4	4	4
        3	3	3	
            2	2
                1
*/
public class PatternQ50{
	public static void main(String[]args){
		int num=0	;
		for(int i=1;i<=7;i++){
		 
			if(i<=4)  
				++num;
			else
				--num;
			for(int j=1;j<=4;j++){  
				if(j>=5-i&&i<=4){
					System.out.print(num+" ");
				}
				else if(j>=i-3&&i>4){
					System.out.print(num+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
	}
}