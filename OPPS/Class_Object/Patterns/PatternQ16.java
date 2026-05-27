/*
Q16. Write a java program to print this pattern.

		#	#	#	#	#
		#	#
		#		#
		#			#
		#				#
*/


    public class PatternQ16{
		public static void main(String[]args){
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++){
					if(i==j||i==1||j==1){
						System.out.print(" # ");
					}else{
						System.out.print("   ");
					}
				}
				
				System.out.println();
			}
			
		}
	}