/*
Q28. Write a java program to print this pattern.||j>=i-4
					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*
*/

public class PatternQ27{
	
	public static void main(String[]args){
		boolean b =true;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i&&j<=4+i&&j<=14-i&&j>=i-4&&b){
					System.out.print(" * ");
					b=false;
				}else{ 
				System.out.print("   ");
				 b=true;
				}
			}
			System.out.println();
		}
	}
}
