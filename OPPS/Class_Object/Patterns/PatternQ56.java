/*
Q56. Write a java program to print this pattern.

			  	   1
                 1   1
               1   2   1
             1   3   3   1
           1	4	6	4	1
*/
public class PatternQ56{
	public static void main(String[]args){
		int i;
		int j;
		
			
		for( i=1;i<=5;i++){
			
			int num=1;
			int c=0;
			boolean b =true;
			for( j=1;j<=9;j++){
				
				
				if(j>=6-i&&j<=4+i&&b){
					System.out.print(num);
					    c++;
					 num=num*(i-c)/c;
					      
					
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