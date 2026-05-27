 /*
 Q31. Write a java program to print this pattern.

					*
				#	#
			*	*	*
		#	#	#	#
	*	*	*	*	*
*/

public class PatternQ31{
public static void main(String[]args){
   for(int i=1;i<=5;i++){
       for(int j=1;j<=5;j++){
	     if(j>=6-i){
		 if(i==2||i==4){
		 System.out.print(" # ");
		 }else{
		 System.out.print(" * ");
		 }
		 }else{
		 System.out.print(" ");
		 }
	  }
	  System.out.println();
   }

  }
 }