/*
Q44. Write a java program to print this pattern.

	#	1	#	2	#
	3	#	4	#	5
	#	6	#	7	#
	8	#	9	#	10
	#	11	#	12	#

*/


public class PatternQ44{
	public static void main (String[]args){
		
		int num =0;
		boolean b=true;
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				
					if(!b){
						System.out.print(++num+"\t");
						
					    b=true;
					}else{
						System.out.print("#\t");
						b =false;
					}
				
			}
			System.out.println();
			
		}
	}
}
