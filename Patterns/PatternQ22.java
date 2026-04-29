/*
Q22. Write a java program to print this pattern.

	       *  *	 *	*  *
	        *	      *
		      *      *
		       *   *
			     *  

*/

public class PatternQ22{
	public static void main(String[]args){
		boolean b=true;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(i==j||j==10-i||i==1&&b){
					
					System.out.print("*");
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