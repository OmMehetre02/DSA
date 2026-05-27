/*Q19. Write a java program to print this pattern.

	        *	*	*	*	*	*	
              *   *	  *   *   *        
		        *    *	 * 	*
		           *   *   *
			         *   *
			           *
					  
*/

public class PatternQ19{
public static void main(String[]args){
	boolean b=true;
	for(int i=1;i<=6;i++){
		for(int j=1;j<=11;j++){
			if(j<=12-i&&j>=i&&b){
				
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