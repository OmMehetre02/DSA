/*
Q72. Write a java program to print this pattern.

	A					          I
       B				      H
          C				  G 
              D		  F
                  E	

*/

	
public class PatternQ72{
	public static void main(String [    ]args){
		char ch =64;
		
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=9;j++){
				if(j==i||j==10-i){
					System.out.print((char)(ch+j)+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}