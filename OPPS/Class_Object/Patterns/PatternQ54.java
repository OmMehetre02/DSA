/*
Q54. Write a java program to print this pattern.
		    		1
   	              2   2
  	            3       3
              4           4
            5	5	5	5	5	
*/
public class PatternQ54{
	public static void main (String[]args){
		
		for(int i=1;i<=5;i++){
			int num=i;
			for(int j=1;j<=9;j++){
				if(j==6-i||j==4+i||i==5){
					System.out.print(num+"\t");
				}
			else {
				System.out.print("\t");
			   }
			}
			System.out.println();
		}
	}
}