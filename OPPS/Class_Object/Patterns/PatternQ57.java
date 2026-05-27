/*
Q57. Write a java program to print this pattern.

	    	    1
   		      1   1
    	    1	    1
 	      1     	  1
        1	2	3	4	1

*/
public class PatternQ57{
	public static void main(String[]args){
		int count = 1;
		for(int i=1;i<=5;i++){
			boolean b =true;
			for(int j=1;j<=9;j++){
				
				if(i==5 && j<=8 && b) {
					System.out.print(count++);
					if(j==9) {
						count = 1;
						System.out.print(count);
					}
					b=false;
				}
				
				else if(j==6-i||j==4+i){
					System.out.print("1");
				}				
				else{
					System.out.print(" ");
	                 	b = true;
				}
			}
			System.out.println();
		}
	}
}